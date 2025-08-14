package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AnkietyTest extends BaseTest {
    @Test
    public void AnkietyTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getAnkietyPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void AnkietyPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getAnkietyPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
    }
    @Test
    public void AnkietyPageTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        var operacja = loginPage.Login().getAnkietyPage();
        String title = operacja.getTitle();
        String url = operacja.getUrl();
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }
}
