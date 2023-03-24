package tests.demoWebShopTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoWebShopPages.DemoWebShopStartPage;
import pages.demoWebShopPages.DemoWebShopSingInModalPage;
import tests.TestInit;

import static org.testng.Assert.assertEquals;
import static pages.demoWebShopPages.DemoWebShopStartPage.demoWebShopHomeUrl;
//import static pages.demoWebShopPages.DemoWebShopStartPage.demoWebShopHomeUrl;

public class DemoWebShopTest extends TestInit {

    @Test
    public void checkDemoWebShopLogin() {
        DemoWebShopStartPage demoWebShopStartPage = new DemoWebShopStartPage(driver);
        DemoWebShopSingInModalPage demoWebShopSingInModalPage = new DemoWebShopSingInModalPage(driver);
        openUrl(demoWebShopHomeUrl);
        sleep(2000);

        String actualUrl = driver.getCurrentUrl();

        assertEquals(actualUrl, demoWebShopHomeUrl, "Актуальний URL не співпадає з очікуваним");

        Assert.assertTrue(demoWebShopStartPage.getDemoPictureHead().isDisplayed());
        // проверь урл сравни ожидаемій і актуальний используй метод вебдрайвера getCurrentUrl

        demoWebShopStartPage.getElementSingIn().click();
        sleep(4000);
        Assert.assertTrue(demoWebShopSingInModalPage.findFormSingIn().isDisplayed());

        demoWebShopSingInModalPage.login("losiktanya00@gmail.com", "Bravo_2009");
        sleep(5000);
        demoWebShopSingInModalPage.findSingInBtn().click();
        Assert.assertTrue(demoWebShopSingInModalPage.findLogOutBtn().isDisplayed());


    }


}
