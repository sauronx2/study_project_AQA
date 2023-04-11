package pages.demoWebShopPages;

import elements.HomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopMainPage extends HomeElements {
    public DemoWebShopMainPage(WebDriver driver) {
        super(driver);
    }

    public String getTextBreadCrumb() {
        return breadCrumbElements().getText();
    }

    public DemoWebShopMainPage clickOnSingInBtn() {
        getSingInBtn().click();
        return this;
    }
    public DemoWebShopMainPage clickCustomerInfoLink(){
        getCustomerInfoLink().click();
        return this;
    }

    public void openApparelShoesPage() {
        WebElement apparelLink = driver.findElement(By.linkText("Apparel & Shoes"));
        apparelLink.click();
    }

    Actions actions = new Actions(driver);

    public DemoWebShopMainPage moveToBooksCategory() {
        actions.moveToElement(getBooksCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickBooksCategoryHeaderMenu() {
        getBooksCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToComputersCategoryHeaderMenu() {
        actions.moveToElement(getComputersCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickComputersCategoryHeaderMenu() {
        getComputersCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToComputersNotebooksCategoryHeaderMenu() {
        actions.moveToElement(getComputersCategoryHeaderMenu())
                .moveToElement(getComputersNotebooksCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickComputersNotebooksCategoryHeaderMenu() {
        getComputersNotebooksCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToComputersDesktopCategoryHeaderMenu() {
        actions.moveToElement(getComputersCategoryHeaderMenu())
                .moveToElement(getComputersDesktopsCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickComputersDesktopCategoryHeaderMenu() {
        getComputersDesktopsCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToComputersAccessoriesCategoryHeaderMenu() {
        actions.moveToElement(getComputersCategoryHeaderMenu())
                .moveToElement(getComputersAccessoriesCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickComputersAccessoriesCategoryHeaderMenu() {
        getComputersAccessoriesCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToElectronicsCategoryHeaderMenu() {
        actions.moveToElement(getElectronicsCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickElectronicsCategoryHeaderMenu() {
        getElectronicsCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToElectronicsCameraPhotoCategoryCategoryHeaderMenu() {
        actions.moveToElement(getElectronicsCategoryHeaderMenu())
                .moveToElement(getElectronicsCameraPhotoCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickElectronicsCameraPhotoCategoryCategoryHeaderMenu() {
        getElectronicsCameraPhotoCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToElectronicsCellPhonesCategoryHeaderMenu() {
        actions.moveToElement(getElectronicsCategoryHeaderMenu())
                .moveToElement(getElectronicsCellPhonesCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickElectronicsCellPhonesCategoryHeaderMenu() {
        getElectronicsCellPhonesCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToApparelsShoesCategoryHeaderMenu() {
        actions.moveToElement(getElectronicsCategoryHeaderMenu())
                .moveToElement(getApparelsShoesCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickApparelsShoesCategoryHeaderMenu() {
        getApparelsShoesCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToDigitalDownloadsCategoryHeaderMenu() {
        actions.moveToElement(getDigitalDownloadsCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickDigitalDownloadsCategoryHeaderMenu() {
        getDigitalDownloadsCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage moveToGiftCardsCategoryHeaderMenu() {
        actions.moveToElement(getGiftCardsCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage moveToJewelryCategoryHeaderMenu() {
        actions.moveToElement(getJewelryCategoryHeaderMenu()).perform();
        return this;
    }

    public DemoWebShopMainPage clickJewelryCategoryHeaderMenu() {
        getJewelryCategoryHeaderMenu().click();
        return this;
    }

    public DemoWebShopMainPage clickGiftCardsCategoryHeaderMenu() {
        getGiftCardsCategoryHeaderMenu().click();
        return this;
    }
}
