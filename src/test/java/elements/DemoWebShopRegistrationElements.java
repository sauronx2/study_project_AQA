package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;


public class DemoWebShopRegistrationElements extends BasePage {
    public DemoWebShopRegistrationElements(WebDriver driver) {
        super(driver);
    }

    public final static String demoWebShopRegisterUrl = "https://demowebshop.tricentis.com/register";

    public List<WebElement> getGenderBtn() {
        return waitPresenceOfAllElements("//input[@name='Gender' and @type='radio']");
    }

    public WebElement getFirstNameField() {
        return waitVisibilityOfElement("//input[@data-val-required='First name is required.']");
    }

    public WebElement getLastNameField() {
        return waitVisibilityOfElement("//input[@data-val-required='Last name is required.']");
    }

    public WebElement getEmailField() {
        return waitVisibilityOfElement("//input[@data-val-required='Email is required.']");
    }

    public WebElement getPasswordField() {
        return waitVisibilityOfElement("//input[@id='Password']");
    }

    public WebElement getConfirmPasswordField() {
        return waitVisibilityOfElement("//input[@id='ConfirmPassword']");
    }

    public WebElement getRegisterBtn() {
        return waitClickableElement("//input[@id='register-button']");
    }

    public WebElement getContinueBtn() {
        return waitClickableElement("//input[@class='button-1 register-continue-button']");
    }


}

