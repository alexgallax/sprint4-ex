package main;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserRule extends ExternalResource {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void before() throws Throwable {
        /*
        System.setProperty("webdriver.chrome.driver", "/Users/alexeyvovk/Projects/local-browser-drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/alexeyvovk/Projects/local-browser-drivers/geckodriver");
         */

        String browser = System.getenv("browser");

        if ("ff".equals(browser)) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Override
    protected void after() {
        driver.quit();
    }
}
