package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class WpisyTest extends BaseTest {
    @Test
    public void WpisyTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getWpisyPage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void WpisyPageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getWpisyPage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));

    }
    @Test
    public void dodanieWpisu(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.
                Login().
                getWpisyPage().
                clickDodajWpisButton()
                .createWpis();

    }
}
