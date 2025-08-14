package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class NarzedziaTest extends BaseTest {
    @Test
    public void NarzedziaTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getNarzędziaPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void NarzedziaPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getNarzędziaPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));

    }
}
