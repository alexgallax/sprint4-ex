package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotFoundPage {

    private final By notFoundImage = By.xpath(".//img[@alt='Not found']");
    private final WebDriver driver;

    public NotFoundPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNotFoundImage() {
        return driver.findElements(notFoundImage).size() > 0;
    }
}
