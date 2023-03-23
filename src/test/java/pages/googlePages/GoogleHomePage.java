package pages.googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class GoogleHomePage extends BasePage {


    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSerchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement clickSingInBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Sign in')]"));
    }
}
