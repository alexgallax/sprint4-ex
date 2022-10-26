package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps {

    private final WebDriver driver;

    public Steps(WebDriver driver) {
        this.driver = driver;
    }

    public Steps open(String url) {
        driver.get(url);
        return this;
    }

    public Steps click(By element) {
        driver.findElement(element).click();
        return this;
    }

    public Steps input(By element, String text) {
        driver.findElement(element).sendKeys(text);
        return this;
    }
}
