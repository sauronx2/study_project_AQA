package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestInit {
    public ChromeOptions options;
    // public WebDriver driver;
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        System.out.println("Start set up driver");

        String headless = System.getProperty("headless");
        if (headless == null) {
            headless = "";
        }
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        if (headless.contains("true")) {
            options.setHeadless(true);
        }
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());



        if (headless.equals("headless")) {
            getDriver().manage().window().setSize(new Dimension(1920, 1080));
        } else {
            getDriver().manage().window().maximize();
        }
        System.out.println("Finish set up driver");
    }
    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod(alwaysRun = true)
    public void quiteDriver() {
        getDriver().quit();
        System.out.println("Quite driver");
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void openUrl(String url) {
        getDriver().get(url);
    }


}
