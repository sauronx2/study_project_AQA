package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestInit {
    protected ChromeOptions options;
    protected WebDriver driver;
//    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        System.out.println("Start set up driver");

//        String headless = System.getProperty("headless");
//        if (headless == null) {
//            headless = "";
//        }
//        options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        if (headless.contains("true")) {
//            options.setHeadless(true);
//        }
//        WebDriverManager.chromedriver().setup();
//        driver.set(new ChromeDriver());
//
//        if (headless.equals("headless")) {
//            getDriver().manage().window().setSize(new Dimension(1920, 1080));
//        } else {
//            getDriver().manage().window().maximize();
//        }


        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        System.out.println("Finish set up driver");
    }


    @AfterMethod(alwaysRun = true)
    public void quiteDriver() {
        driver.quit();
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
        driver.get(url);
    }


}
