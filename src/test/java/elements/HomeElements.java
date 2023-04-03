package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomeElements extends BasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public final static String demoWebShopHomeUrl = "https://demowebshop.tricentis.com/";

    public WebElement breadCrumbElements() {
        return waitVisibilityOfElement("//div[@class='breadcrumb']");
    }
    
    public WebElement getDemoPictureHead() {
        return waitVisibilityOfElement("//img[@alt='Tricentis Demo Web Shop']");
    }

    public WebElement getSingInBtn() {
        return waitClickableElement("//a[@class='ico-login']");
    }

    public WebElement getEmailBtn() {
        return waitVisibilityOfElement("//div[@class='header-links']// a[@class='account']");
    }

    public WebElement getBooksCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("books"));
    }

    public WebElement getComputersCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("computers"));
    }

    public WebElement getComputersDesktopsCategoryHeaderMenu() {
        return waitPresenceOfElement(getCategoryLocator("desktops"));
    }

    public WebElement getComputersNotebooksCategoryHeaderMenu() {
        return waitPresenceOfElement(getCategoryLocator("notebooks"));
    }

    public WebElement getComputersAccessoriesCategoryHeaderMenu() {
        return waitPresenceOfElement(getCategoryLocator("accessories"));
    }

    public WebElement getElectronicsCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("electronics"));
    }

    public WebElement getElectronicsCameraPhotoCategoryHeaderMenu() {
        return waitPresenceOfElement(getCategoryLocator("camera-photo"));
    }

    public WebElement getElectronicsCellPhonesCategoryHeaderMenu() {
        return waitPresenceOfElement(getCategoryLocator("cell-phones"));
    }

    public WebElement getApparelsShoesCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("apparel-shoes"));
    }

    public WebElement getDigitalDownloadsCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("digital-downloads"));
    }

    public WebElement getJewelryCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("jewelry"));
    }

    public WebElement getGiftCardsCategoryHeaderMenu() {
        return waitVisibilityOfElement(getCategoryLocator("gift-cards"));
    }

    private String getCategoryLocator(String value) {
        return String.format("//ul[@class='top-menu']//a[@href='/%s']", value);
    }


}
