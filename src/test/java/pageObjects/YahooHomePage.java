package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends BasePage{
    public YahooHomePage(WebDriver driver3) {
        super(driver3);
    }

    public WebElement getSerchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }
}
