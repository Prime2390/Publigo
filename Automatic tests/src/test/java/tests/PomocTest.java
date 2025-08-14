package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class PomocTest extends BaseTest {
    @Test
    public void PomocTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getPomocPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void PomocPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getPomocPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));

    }
}
