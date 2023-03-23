package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{


    public GoogleHomePage(WebDriver driver2){
        super(driver2);
    }
    public WebElement getSerchField() {
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public WebElement clickSingInBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Sign in')]"));
    }
}
