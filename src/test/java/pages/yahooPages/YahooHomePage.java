package pages.yahooPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class YahooHomePage extends BasePage {
    public YahooHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSerchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }
}
