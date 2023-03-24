package tests.googleTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.googlePages.GoogleHomePage;
import tests.TestInit;

public class TestWebDriver extends TestInit {
    @Test
    public void runGoogle() {
        openUrl("https://google.com.ua");

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.getSerchField().sendKeys("cat\n");
    }

    @Test
    public void clickButton() {
        openUrl("https://google.com.ua");

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.clickSingInBtn().click();
        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("losikwe00");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        //TODO: add assert
    }
}
