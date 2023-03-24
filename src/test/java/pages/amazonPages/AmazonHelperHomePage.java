package pages.amazonPages;

import org.openqa.selenium.WebDriver;

public class AmazonHelperHomePage extends AmazonElementsHomePage {
    public AmazonHelperHomePage(WebDriver driver) {
        super(driver);
    }

    public void goToAmazon() {
        driver.get("https://www.amazon.com/");
    }

    public AmazonSearchResultsPage serch(String searchWord) {
        getSearchField().sendKeys(searchWord);
        getSearchBtn().click();
        return new AmazonSearchResultsPage(driver);
    }
}
