package orderstatus;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.MainPage;
import steps.Steps;

import static main.Utils.randomString;
import static org.junit.Assert.assertTrue;

public class CheckOrderStatus {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void notFoundShownWhenNotExistingOrderStatus() {
        MainPage mainPage = new MainPage(browserRule.getDriver());

        mainPage
                .open()
                .clickOrderStatusButton()
                .inputOrder(randomString())
                .clickGoButton();

        assertTrue(mainPage.notFoundPage().isNotFoundImage());
    }

    @Test
    public void notFoundShownWhenNotExistingOrderStatus2() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        Steps steps = new Steps(browserRule.getDriver());

        steps
                .open(mainPage.getUrl())
                .click(mainPage.getOrderStatusButton())
                .input(mainPage.getOrderInput(), randomString())
                .click(mainPage.getGoButton());

        assertTrue(mainPage.notFoundPage().isNotFoundImage());
    }
}
