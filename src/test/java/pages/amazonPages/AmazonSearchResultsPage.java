package pages.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class AmazonSearchResultsPage extends BasePage {
    public AmazonSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsField() {
        return driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
    }

    public List<WebElement> getElementsWithPenText() {
        return driver.findElements(By.xpath("//*[contains(text(), 'pen')]"));
    }
}
