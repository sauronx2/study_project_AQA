package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomeElements extends BasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public final static String demoWebShopHomeUrl = "https://demowebshop.tricentis.com/";

    public WebElement getDemoPictureHead() {
        return waitVisibilityOfElement("//img[@alt='Tricentis Demo Web Shop']");
    }

    public WebElement getSingInBtn() {
        return waitClickableElement("//a[@class='ico-login']");
    }

    public WebElement getEmailBtn() {
        return waitVisibilityOfElement("//div[@class='header-links']// a[@class='account']");
    }


}
