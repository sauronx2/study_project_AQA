package tests.demoWebShopTests;

import elements.AccountAddressesElements;
import elements.HomeElements;
import org.testng.annotations.Test;
import pages.demoWebShopPages.AccountAddressesPage;
import pages.demoWebShopPages.DemoWebShopMainPage;
import pages.demoWebShopPages.DemoWebShopRegistrationPage;
import tests.TestInit;

import static elements.DemoWebShopRegistrationElements.demoWebShopRegisterUrl;
import static elements.HomeElements.demoWebShopHomeUrl;
import static org.testng.Assert.assertEquals;
import static utils.Utils.*;

public class DemoWebShopRegistrationTest extends TestInit {
    @Test
    public void checkRegistration() {
        DemoWebShopRegistrationPage demoWebShopRegistrationPage = new DemoWebShopRegistrationPage(driver);
        DemoWebShopMainPage demoWebShopStartPage = new DemoWebShopMainPage(driver);
        AccountAddressesPage accountAddressesPage = new AccountAddressesPage(driver);
        AccountAddressesElements accountAddressesElements = new AccountAddressesElements(driver);
        HomeElements homeElements = new HomeElements(driver);
        String registrationFirstName = getRandomFirstName();
        String registrationLastName = getRandomLastName();
        String registrationEmail = getRandomEmail();
        String password = getRandomPassword();
        String address = getRandomAddress1();
        openUrl(demoWebShopHomeUrl);
        demoWebShopStartPage
                .getRegisterBtn()
                .click();

        String registerUrl = getUrl();
        assertEquals(registerUrl, demoWebShopRegisterUrl, "Актуальний URL Register не співпадає з очікуваним");


        demoWebShopRegistrationPage
                .selectRandomGender()
                .enterYourPersonalDetails(registrationFirstName, registrationLastName, registrationEmail)
                .enterRegisYourPassword(password, password)
                .clickRegisterBtn();

        String registrationPageURL = getUrl();
        assertEquals(registrationPageURL, demoWebShopHomeUrl + "registerresult/1"
                , "Актуальний URL не співпадає з очікуваним");
        assertEquals(homeElements.getCustomerInfoLink().getText(), registrationEmail, "Email is invalid");
        demoWebShopRegistrationPage.clickContinueBtn();
        demoWebShopStartPage.clickCustomerInfoLink();
        String addressPageCheckURL = getUrl();
        assertEquals(addressPageCheckURL, demoWebShopHomeUrl + "customer/info"
                , "Актуальний URL не співпадає з очікуваним");
        accountAddressesPage.clickAddressesBackMenu();
        accountAddressesPage.clickAddNewAddress();

        accountAddressesPage.enterNameEmailCompany(registrationFirstName, registrationLastName
                        , registrationEmail, getRandomCompany())
                .chooseRandomCountry()
                .enterAdresses(getRandomCity(), getRandomAddress1()
                        , getRandomAddress1(), getRandomZipPostalCod())
                .enterNumber(getRandomPhoneNumber(), getRandomFax())
                .clickSubmitBtn();


        System.out.println(accountAddressesElements.getAccountAddress().getText());
    }

}
