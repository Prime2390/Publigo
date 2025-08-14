package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class UzytkownicyTest extends BaseTest {
    @Test
    public void UzytkownicyTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getUzytkownicyPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void UzytkownicyPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getUzytkownicyPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));

    }
    @Test
    public void DodajNowegoUzutkownika() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .Login()
                .getUzytkownicyPage()
                .dodajNowegoUzytkownika();
    }
}
