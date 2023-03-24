package pages.demoWebShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DemoWebShopSingInModalPage extends BasePage {
    public DemoWebShopSingInModalPage(WebDriver driver) {
        super(driver);
    }
    public WebElement findFormSingIn(){
        return driver.findElement(By.xpath("//div[@class='page-title']"));
    }

    public WebElement findFormForEmail(){
        return driver.findElement(By.xpath("//input[@class='email']"));
    }
    public WebElement findFormForPass(){
        return driver.findElement(By.xpath("//input[@class='password']"));
    }
    public WebElement findSingInBtn(){
        return driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
    }
    public DemoWebShopSingInModalPage login(String email, String password){
        findFormForEmail().sendKeys(email);
        findFormForPass().sendKeys(password);
        return new DemoWebShopSingInModalPage(driver);
    }
    public WebElement findLogOutBtn(){
        return driver.findElement(By.xpath("//a[@class='ico-logout']"));
    }

}
