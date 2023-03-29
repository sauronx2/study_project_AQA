package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ApparelShoesElements extends BasePage {
    public ApparelShoesElements(WebDriver driver) {
        super(driver);
    }

    public final static String apparelShoesUrl = "https://demowebshop.tricentis.com/apparel-shoes";

    public WebElement getSortDropdownPrice() {
        return driver.findElement(By.id("products-orderby"));
    }

    public WebElement getDisplayBy() {
        return driver.findElement(By.id("products-pagesize"));
    }
}
