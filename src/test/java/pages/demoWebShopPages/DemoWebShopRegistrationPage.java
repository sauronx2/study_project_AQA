package pages.demoWebShopPages;

import elements.DemoWebShopRegistrationElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.Utils.randomNum;

public class DemoWebShopRegistrationPage extends DemoWebShopRegistrationElements {
    public DemoWebShopRegistrationPage(WebDriver driver) {
        super(driver);
    }

    DemoWebShopRegistrationElements demoWebShopRegistrationElements = new DemoWebShopRegistrationElements(driver);

    public DemoWebShopRegistrationPage selectRandomGender() {
        int randomIndex = randomNum(demoWebShopRegistrationElements.getGenderBtn().size());
        WebElement randomElement = demoWebShopRegistrationElements.getGenderBtn().get(randomIndex);
        randomElement.click();
        return this;
    }

    public DemoWebShopRegistrationPage enterYourPersonalDetails(String firstName, String lastName, String email) {
        getFirstNameField().sendKeys(firstName);
        getLastNameField().sendKeys(lastName);
        getEmailField().sendKeys(email);
        return this;
    }

    public DemoWebShopRegistrationPage clickContinueBtn() {
        getContinueBtn().click();
        return this;
    }

    public DemoWebShopRegistrationPage enterRegisYourPassword(String password, String confirmPassword) {
        getPasswordField().sendKeys(password);
        getConfirmPasswordField().sendKeys(confirmPassword);
        return this;
    }

    public DemoWebShopRegistrationPage clickRegisterBtn() {
        getRegisterBtn().click();
        return this;
    }

}
