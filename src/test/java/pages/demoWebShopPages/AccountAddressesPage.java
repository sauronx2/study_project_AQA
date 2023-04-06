package pages.demoWebShopPages;

import elements.AccountAddressesElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static utils.Utils.randomNum;

public class AccountAddressesPage extends AccountAddressesElements {

    public AccountAddressesPage(WebDriver driver) {
        super(driver);
    }

    public AccountAddressesPage clickAddressesBackMenu() {
        getAddressesBackMenu().click();
        return this;
    }

    public AccountAddressesPage clickAddNewAddress() {
        getAddNewAddressBtn().click();
        return this;
    }

    public AccountAddressesPage chooseRandomCountry() {
        Select countryOptions = new Select(getCountrySelect());
        List<WebElement> options = countryOptions.getWrappedElement().findElements(By.tagName("option"));
        int countrySize = options.size();
        int randomIndex = randomNum(countrySize);
        countryOptions.selectByIndex(randomIndex);
        return this;
    }

    public AccountAddressesPage enterNameEmailCompany(String firstName, String lastName, String email, String company) {
        getFirstNameAddressPage().sendKeys(firstName);
        getLastNameAddressPage().sendKeys(lastName);
        getEmailAddressPage().sendKeys(email);
        getCompanyAddressPage().sendKeys(company);
        return this;
    }
    public AccountAddressesPage enterAdresses(String city, String address1, String address2, String zip){
        getCityAddressPage().sendKeys(city);
        getAddress1Page().sendKeys(address1);
        getAddress2Page().sendKeys(address2);
        getZipPostalCodeAddressPage().sendKeys(zip);
        return this;
    }
    public AccountAddressesPage enterNumber(String phoneNumber, String faxNumber){
        getPhoneNumberAddressPage().sendKeys(phoneNumber);
        getFaxNumberAddressPage().sendKeys(faxNumber);
        return this;
    }

    public AccountAddressesPage clickSubmitBtn() {
        getSubmitBtn().click();
        return this;
    }

}
