package pages.demoWebShopPages;

import elements.SingInElements;
import org.openqa.selenium.WebDriver;

public class DemoWebShopSingInModalPage extends SingInElements {
    public DemoWebShopSingInModalPage(WebDriver driver) {
        super(driver);
    }

    public DemoWebShopSingInModalPage enterLogInCredentials(String email, String password) {
        getEmailInput().sendKeys(email);
        getPasswordInput().sendKeys(password);
        return this;
    }

    public DemoWebShopSingInModalPage clickOnLigInBtn() {
        getLogInBtn().click();
        return this;
    }
}
