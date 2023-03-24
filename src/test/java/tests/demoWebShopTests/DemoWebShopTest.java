package tests.demoWebShopTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoWebShopPages.DemoWebShopMainPage;
import pages.demoWebShopPages.DemoWebShopSingInModalPage;
import tests.TestInit;

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

}
