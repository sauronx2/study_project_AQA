package pages.demoWebShopPages;

import elements.HomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoWebShopMainPage extends HomeElements {
    public DemoWebShopMainPage(WebDriver driver) {
        super(driver);
    }

    public DemoWebShopMainPage clickOnSingInBtn() {
        getSingInBtn().click();
        return this;
    }

    public void openApparelShoesPage() {
        WebElement apparelLink = driver.findElement(By.linkText("Apparel & Shoes"));
        apparelLink.click();
    }
}
