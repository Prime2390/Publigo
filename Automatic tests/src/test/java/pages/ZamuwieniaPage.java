package pages;

import model.Platnik;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZamuwieniaPage extends BasePage {
    public ZamuwieniaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się w zakładce zamowienia");
    }

    @FindBy(xpath = "//*[@id=\"table-view-container\"]/div[1]/div[1]/a")
    private WebElement addPaymentButton;
    @FindBy(name = "downloads[0][id]")
    private WebElement selectProdukt;
    @FindBy(id = "edd-mp-user")
    private WebElement email;
    @FindBy(name = "first")
    private WebElement imie;
    @FindBy(name = "last")
    private WebElement nazwisko;
    @FindBy(id = "edd-mp-amount")
    private WebElement kwota;
    @FindBy(name = "status")
    private WebElement statusPlatnosci;
    @FindBy(name = "date")
    private WebElement data;
    @FindBy(name = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"table-view-container\"]/div[2]/div/table/tbody/tr")
    private List<WebElement> zamowienia;

    public int getLiczbaZamowien() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int licznik = 0;
        for (WebElement element : zamowienia) {
            if (!element.getAttribute("class").contains("no_items")) {
                licznik++;
            }
        }
        System.out.println("Liczba zamówień: " + licznik);
        return licznik - 1;
    }

    public ZamuwieniaPage clickAddPaymentButton() {
        System.out.println("Dodaje zamówienie");
        click(addPaymentButton);
        return this;

    }
    public void utworzPlatnosc(String statusPlatnosc) {
        Platnik platnik = new Platnik();
        System.out.println("Wybieram produkt" + selectProdukt.getAttribute("value"));
        Select select = new Select(selectProdukt);
        select.selectByVisibleText("lol");
        System.out.println("Podaje Email" + email.getAttribute("value"));
        type(email, platnik.getEmail());
        System.out.println("Podaje Imie" + imie.getAttribute("value"));
        type(imie, platnik.getImie());
        System.out.println("Podaje Nazwisko" + nazwisko.getAttribute("value"));
        type(nazwisko, platnik.getNazwisko());
        System.out.println("Podaje Kwota" + kwota.getAttribute("value"));
        type(kwota, platnik.getKwota());
        System.out.println("Podaje Status" + statusPlatnosci.getAttribute("value"));
        Select status = new Select(statusPlatnosci);
        status.selectByVisibleText(statusPlatnosc);
        System.out.println("Podaje Data" + data.getAttribute("value"));
        type(data,"07/10/2025");
        System.out.println("Klikam utwórz płatność");
        click(submitButton);

    }

}
