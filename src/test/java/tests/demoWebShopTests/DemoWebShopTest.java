package tests.demoWebShopTests;

import org.testng.annotations.Test;
import pages.demoWebShopPages.ApparelShoesPages;
import pages.demoWebShopPages.DemoWebShopMainPage;
import pages.demoWebShopPages.DemoWebShopSingInModalPage;
import tests.TestInit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static elements.ApparelShoesElements.apparelShoesUrl;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pages.demoWebShopPages.DemoWebShopMainPage.demoWebShopHomeUrl;
import static pages.demoWebShopPages.DemoWebShopSingInModalPage.demoWebShopHomeLogInUrl;

public class DemoWebShopTest extends TestInit {

    @Test
    public void checkDemoWebShopLogin() {
        DemoWebShopMainPage demoWebShopStartPage = new DemoWebShopMainPage(driver);
        DemoWebShopSingInModalPage demoWebShopSingInModalPage = new DemoWebShopSingInModalPage(driver);
        openUrl(demoWebShopHomeUrl);

        String actualUrl = getUrl();
        String email = "losiktanya00@gmail.com";

        assertEquals(actualUrl, demoWebShopHomeUrl, "Актуальний URL не співпадає з очікуваним");
        assertTrue(demoWebShopStartPage.getDemoPictureHead().isDisplayed());

        demoWebShopStartPage.clickOnSingInBtn();

        assertTrue(demoWebShopSingInModalPage.getSingInHeaderText().isDisplayed());

        String expectedHeaderText = "Welcome, Please Sign In!";
        assertEquals(demoWebShopSingInModalPage.getSingInHeaderText().getText(), expectedHeaderText);

        String logInUrl = getUrl();
        assertEquals(logInUrl, demoWebShopHomeLogInUrl, "Актуальний URL Log in не співпадає з очікуваним");

        demoWebShopSingInModalPage
                .enterLogInCredentials(email, "Bravo_2009")
                .clickOnLigInBtn();


        assertTrue(demoWebShopSingInModalPage.findLogOutBtn().isDisplayed());
        assertEquals(demoWebShopStartPage.getEmailBtn().getText(), email);

    }


    @Test
    public void checkApparelShoesSort() {
        DemoWebShopMainPage demoWebShopStartPage = new DemoWebShopMainPage(driver);
        DemoWebShopSingInModalPage demoWebShopSingInModalPage = new DemoWebShopSingInModalPage(driver);
        ApparelShoesPages apparelShoesPage = new ApparelShoesPages(driver);
        openUrl(demoWebShopHomeUrl);

        String email = "losiktanya00@gmail.com";
        String password = "Bravo_2009";

        demoWebShopStartPage
                .clickOnSingInBtn();

        String logInUrl = getUrl();
        assertEquals(logInUrl, demoWebShopHomeLogInUrl, "Актуальний URL Log in не співпадає з очікуваним");

        demoWebShopSingInModalPage
                .enterLogInCredentials(email, password)
                .clickOnLigInBtn();

        assertEquals(demoWebShopStartPage.getEmailBtn().getText(), email);

        demoWebShopStartPage
                .openApparelShoesPage();
        String nonParamActualUrl = getUrl();
        assertEquals(nonParamActualUrl, apparelShoesUrl, "Actual and expected URL do not match");

        apparelShoesPage
                .sortByPriceHighToLow()
                .displayTwelveProducts();
        String parametrizedActualUrl = getUrl();
        assertEquals(parametrizedActualUrl, apparelShoesUrl + "?orderby=11&pagesize=12", "Sorting did not work as expected");

        List<Double> prices = apparelShoesPage.getProductPrices();
        List<Double> sortedPrices = new ArrayList<>(prices);
        sortedPrices.sort(Collections.reverseOrder());
        assertEquals(prices, sortedPrices, "Products are not sorted by price from high to low");
    }
}
