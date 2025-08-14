package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TagiProduktoweTest extends BaseTest {
    @Test
    public void TagiProduktoweTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage
                .Login()
                .getTagiProduktowePage()
                .getTitle();

        System.out.println("Sprawdzam aktualny tytuł stronu z oczekiwanym");
        Assert.assertTrue(title.equals(driver.getTitle()));
    }
    @Test
    public void TagiProduktowePageUrl() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String url = loginPage
                .Login()
                .getTagiProduktowePage()
                .getUrl();

        System.out.println("Sprawdzam aktualny URL stronu z oczekiwanym");
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
    }
}
