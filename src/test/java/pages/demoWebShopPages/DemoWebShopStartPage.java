package pages.demoWebShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DemoWebShopStartPage extends BasePage {
    public DemoWebShopStartPage(WebDriver driver) {
        super(driver);
    }

    public final static String demoWebShopHomeUrl = "https://demowebshop.tricentis.com/";

    public WebElement getDemoPictureHead(){
        return driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
    }
    public WebElement getElementSingIn(){
        return driver.findElement(By.xpath("//a[@class='ico-login']"));
    }


}
