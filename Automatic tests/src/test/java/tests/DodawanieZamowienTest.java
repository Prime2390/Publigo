package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DodawanieZamowienTest extends BaseTest {
    @Test
    public void ZwiekszSprzedazTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        var zamowieniaPage = loginPage
                .Login()
                .getZamowieniaPage();

        int liczbaZamowienPrzed = zamowieniaPage
                .getLiczbaZamowien();

        zamowieniaPage
                .clickAddPaymentButton()
                .utworzPlatnosc("Zakończone");

        int liczbaZamowienPo = zamowieniaPage
                .getLiczbaZamowien();

        Assert.assertEquals(liczbaZamowienPo, liczbaZamowienPrzed + 1, "Liczba zamówień nie zwiększyła się o 1");
    }

}
