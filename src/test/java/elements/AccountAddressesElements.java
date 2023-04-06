package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class AccountAddressesElements extends BasePage {

    public AccountAddressesElements(WebDriver driver) {
        super(driver);
    }

    public final static String addAddressesURL = "https://demowebshop.tricentis.com/customer/info";

    public WebElement getAddressesBackMenu() {
        return waitPresenceOfElement("//a[@href='/customer/addresses' and @class='inactive']");
    }

    public WebElement getAddNewAddressBtn() {
        return waitPresenceOfElement("//input[@value='Add new']");
    }

    public WebElement getFirstNameAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='First name is required.']");
    }

    public WebElement getLastNameAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='Last name is required.']");
    }

    public WebElement getEmailAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='Email is required.']");
    }

    public WebElement getCompanyAddressPage() {
        return waitClickableElement("//input[@name='Address.Company']");
    }

    public WebElement getCountrySelect() {
        return driver.findElement(By.id("Address_CountryId"));
                //"//select[@id='Address_CountryId']");
    }

    public WebElement getCityAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='City is required']");
    }

    public WebElement getAddress1Page() {
        return waitVisibilityOfElement("//input[@data-val-required='Street address is required']");
    }

    public WebElement getAddress2Page() {
        return waitVisibilityOfElement("//input[@name='Address.Address2']");
    }

    public WebElement getZipPostalCodeAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='Zip / postal code is required']");
    }

    public WebElement getPhoneNumberAddressPage() {
        return waitVisibilityOfElement("//input[@data-val-required='Phone is required']");
    }

    public WebElement getFaxNumberAddressPage() {
        return waitVisibilityOfElement("//input[@name='Address.FaxNumber']");
    }

    public WebElement getSubmitBtn(){
        return waitClickableElement("//input[@class='button-1 save-address-button']");
    }

    //public WebElement
    public WebElement getAccountAddress(){
        return waitVisibilityOfElement("//ul[@class='info']");
    }

}
