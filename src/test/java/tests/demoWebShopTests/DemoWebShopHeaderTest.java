package tests.demoWebShopTests;

import org.testng.annotations.Test;
import pages.demoWebShopPages.DemoWebShopMainPage;
import tests.TestInit;

import static elements.HomeElements.demoWebShopHomeUrl;
import static org.testng.Assert.assertEquals;

public class DemoWebShopHeaderTest extends TestInit {

    @Test
    public void checkAllCategoriesInHeader() {
        DemoWebShopMainPage demoWebShopStartPage = new DemoWebShopMainPage(driver);
        openUrl(demoWebShopHomeUrl);
        demoWebShopStartPage
                .moveToBooksCategory()
                .clickBooksCategoryHeaderMenu();
        String booksCategoriesUrl = getUrl();

        assertEquals(booksCategoriesUrl, demoWebShopHomeUrl + "books", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / BOOKS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToComputersCategoryHeaderMenu()
                .clickComputersCategoryHeaderMenu();
        String computersCategoryURL = getUrl();
        assertEquals(computersCategoryURL, demoWebShopHomeUrl + "computers", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / COMPUTERS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage
                .moveToComputersDesktopCategoryHeaderMenu()
                .clickComputersDesktopCategoryHeaderMenu();
        String computersDesktopCategoryURL = getUrl();
        assertEquals(computersDesktopCategoryURL, demoWebShopHomeUrl + "desktops", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / COMPUTERS / DESKTOPS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToComputersNotebooksCategoryHeaderMenu()
                .clickComputersNotebooksCategoryHeaderMenu();
        String computersNotebooksCategoryURL = getUrl();
        assertEquals(computersNotebooksCategoryURL, demoWebShopHomeUrl + "notebooks", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / COMPUTERS / NOTEBOOKS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToComputersAccessoriesCategoryHeaderMenu()
                .clickComputersAccessoriesCategoryHeaderMenu();
        String computersAccessoriesCategoryURL = getUrl();
        assertEquals(computersAccessoriesCategoryURL, demoWebShopHomeUrl + "accessories", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / COMPUTERS / ACCESSORIES", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToElectronicsCategoryHeaderMenu()
                .clickElectronicsCategoryHeaderMenu();
        String electronicsCategoryURL = getUrl();
        assertEquals(electronicsCategoryURL, demoWebShopHomeUrl + "electronics", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / ELECTRONICS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToElectronicsCameraPhotoCategoryCategoryHeaderMenu()
                .clickElectronicsCameraPhotoCategoryCategoryHeaderMenu();
        String electronicsCameraPhotoCategoryURL = getUrl();
        assertEquals(electronicsCameraPhotoCategoryURL, demoWebShopHomeUrl + "camera-photo", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / ELECTRONICS / CAMERA, PHOTO", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToElectronicsCellPhonesCategoryHeaderMenu()
                .clickElectronicsCellPhonesCategoryHeaderMenu();
        String electronicsCellPhonesCategoryURL = getUrl();
        assertEquals(electronicsCellPhonesCategoryURL, demoWebShopHomeUrl + "cell-phones", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / ELECTRONICS / CELL PHONES", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToApparelsShoesCategoryHeaderMenu()
                .clickApparelsShoesCategoryHeaderMenu();
        String apparelsShoesCategoryURL = getUrl();
        assertEquals(apparelsShoesCategoryURL, demoWebShopHomeUrl + "apparel-shoes", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / APPAREL & SHOES", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToDigitalDownloadsCategoryHeaderMenu()
                .clickDigitalDownloadsCategoryHeaderMenu();
        String digitalDownloadsCategoryURL = getUrl();
        assertEquals(digitalDownloadsCategoryURL, demoWebShopHomeUrl + "digital-downloads", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / DIGITAL DOWNLOADS", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToJewelryCategoryHeaderMenu()
                .clickJewelryCategoryHeaderMenu();
        String jewelryCategoryURL = getUrl();
        assertEquals(jewelryCategoryURL, demoWebShopHomeUrl + "jewelry", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / JEWELRY", "Actual and expected bread crumb do not match");

        demoWebShopStartPage.moveToGiftCardsCategoryHeaderMenu()
                .clickGiftCardsCategoryHeaderMenu();
        String giftCardsCategoryURL = getUrl();
        assertEquals(giftCardsCategoryURL, demoWebShopHomeUrl + "gift-cards", "Actual and expected URL do not match");
        assertEquals(demoWebShopStartPage.getTextBreadCrumb(), "HOME / GIFT CARDS", "Actual and expected bread crumb do not match");
    }
}
