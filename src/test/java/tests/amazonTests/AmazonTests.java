package tests.amazonTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.amazonPages.AmazonHelperHomePage;
import pages.amazonPages.AmazonSearchResultsPage;
import tests.TestInit;

import static org.testng.Assert.assertTrue;

public class AmazonTests extends TestInit {

    @Test
    public void checkHeader() {
        AmazonHelperHomePage amazonHelperHomePage = new AmazonHelperHomePage(driver);
        amazonHelperHomePage.goToAmazon();

        Assert.assertTrue(amazonHelperHomePage.getLogo().isDisplayed());
        Assert.assertTrue(amazonHelperHomePage.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHelperHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHelperHomePage.getSearchBtn().isDisplayed());
    }

    @Test
    public void checkSearch() {
        AmazonHelperHomePage amazonHelperHomePage = new AmazonHelperHomePage(driver);
        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);

        amazonHelperHomePage.goToAmazon();
        amazonHelperHomePage.getSearchField().sendKeys("hat");
        amazonHelperHomePage.getSearchBtn().click();

        sleep(5000);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
    }

    @Test
    public void checkSearchPen() {
        AmazonHelperHomePage amazonHelperHomePage = new AmazonHelperHomePage(driver);
        amazonHelperHomePage.goToAmazon();
        AmazonSearchResultsPage amazonSearchResultsPage = amazonHelperHomePage.serch("pen");

        sleep(5000);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
        assertTrue(amazonSearchResultsPage.getResultsField().getText().contains("results"));
        Assert.assertTrue(amazonSearchResultsPage.getElementsWithPenText().size() > 10);
    }

    @Test
    public void checkCopy() {
        AmazonHelperHomePage amazonHelperHomePage = new AmazonHelperHomePage(driver);
        amazonHelperHomePage.goToAmazon();
        sleep(3000);
        Assert.assertTrue(amazonHelperHomePage.getCopy().isDisplayed());

    }
}
