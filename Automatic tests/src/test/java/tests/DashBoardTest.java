package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DashBoardTest extends BaseTest {
    @Test
    public void DashBoardTitle() throws InterruptedException {
       LoginPage loginPage = new LoginPage(driver);
       String title = loginPage
               .Login()
               .getTitle();

       System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
       Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void DashBoardPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
    }
}
