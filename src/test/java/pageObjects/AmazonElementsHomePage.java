package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonElementsHomePage extends BasePage{
    public AmazonElementsHomePage(WebDriver driver3) {
        super(driver3);
    }

    public WebElement getLogo(){
        return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

    }
    public WebElement getDeliverTo(){
        return driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
    public WebElement getSearchBtn(){
        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    }
    public WebElement getCopy(){return driver.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));}
}
