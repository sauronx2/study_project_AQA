package pages.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class AmazonElementsHomePage extends BasePage {
    public AmazonElementsHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

    }

    public WebElement getDeliverTo() {
        return driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    }

    public WebElement getCopy() {
        return driver.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));
    }
}
