package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ProgamPartnerskiTest extends BaseTest {
    @Test
    public void ProgramPartnerskiTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getProgramPartnerskiPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void ProgramPartnerskiPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getProgramPartnerskiPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
    }
}
