package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.demoWebShopPages.DemoWebShopSingInModalPage;

public class SingInElements extends BasePage {
    public SingInElements(WebDriver driver) {
        super(driver);
    }

    public final static String demoWebShopHomeLogInUrl = "https://demowebshop.tricentis.com/login";


    public WebElement getSingInHeaderText() {
        return waitVisibilityOfElement("//div[@class='page-title']");
    }

    public WebElement getEmailInput() {
        return waitVisibilityOfElement("//input[@class='email']");
    }

    public WebElement getPasswordInput() {
        return waitVisibilityOfElement("//input[@class='password']");
    }

    public WebElement getLogInBtn() {
        return waitClickableElement("//input[@class='button-1 login-button']");
    }

    public WebElement findLogOutBtn() {
        return waitVisibilityOfElement("//a[@class='ico-logout']");
    }


}
