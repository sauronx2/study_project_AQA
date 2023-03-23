package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.GoogleHomePage;

public class TestWebDriver extends TestInit{
    @Test
    public void runGoogle()  {

        openUrl("https://google.com.ua");
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
        googleHomePage.getSerchField().sendKeys("cat\n");
    }
    @Test
    public void clickButton(){


        openUrl("https://google.com.ua");
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
        googleHomePage.clickSingInBtn().click();
        getDriver().findElement(By.xpath("//input[@name='identifier']")).sendKeys("losikwe00");
        getDriver().findElement(By.xpath("//span[text()='Next']")).click();
    }
}
