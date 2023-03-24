package pages.demoWebShopPages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;

public class DemoWebShopMainPage extends HomeElements {
    public DemoWebShopMainPage(WebDriver driver) {
        super(driver);
    }


    public DemoWebShopMainPage clickOnSingInBtn() {
        getSingInBtn().click();
        return this;
    }

}
