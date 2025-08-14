package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class KategorieTest  extends BaseTest {
    @Test
    public void KategorieTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getKategoriePage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void KategoriePageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getKategoriePage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
    }
}
