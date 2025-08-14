package tests;

import config.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTest{
    WebDriver driver;
    WebDriverWait wait;
    String browser = PropertiesReader.read("browser");
    String url = PropertiesReader.read("url");

    @BeforeMethod
    public void setUp() {
        if (browser.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--headless");
            driver = new ChromeDriver();
        } else if (browser.contains("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("start-maximized");
            driver = new FirefoxDriver(options);
        }
        driver.get(url);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
