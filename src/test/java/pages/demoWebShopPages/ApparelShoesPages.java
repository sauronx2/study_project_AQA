package pages.demoWebShopPages;

import elements.ApparelShoesElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ApparelShoesPages extends ApparelShoesElements {

    public ApparelShoesPages(WebDriver driver) {
        super(driver);
    }

    public ApparelShoesPages sortByPriceHighToLow() {
        Select selectByHighLowPrice = new Select(getSortDropdownPrice());
        selectByHighLowPrice.selectByVisibleText("Price: High to Low");
        return this;
    }

    public ApparelShoesPages displayTwelveProducts() {
        Select selectDisplay = new Select(getDisplayBy());
        selectDisplay.selectByVisibleText("12");
        return this;
    }

    public List<Double> getProductPrices() {
        List<Double> prices = new ArrayList<Double>();
        List<WebElement> productPriceElements = waitPresenceOfAllElements("//span[@class='price actual-price']");
        for (WebElement element : productPriceElements) {
            String priceText = element.getText().replace(",", "").replace("$", "");
            Double price = Double.parseDouble(priceText);
            prices.add(price);
        }
        return prices;
    }
}