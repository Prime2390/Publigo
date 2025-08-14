package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WpisyPage extends BasePage {
    public WpisyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się na zakładce wpisy");
    }
    @FindBy(xpath = "//*[@id=\"wpbody-content\"]/div[3]/a")
    private WebElement dodajWpisButton;

    @FindBy(xpath = "/html/body/div[2]/h1")
    private WebElement dodajTytulType;
    @FindBy(xpath = "//*[@id=\"block-05df3bb8-8aa7-4b2a-bb5c-bbb6515c1fd1\"]")
    private WebElement dodajWpisType;
    @FindBy(xpath = "//*[@id=\"editor\"]/div/div[1]/div[1]/div[1]/div/div[4]/button[3]")
    private WebElement opublikujButton;

    public WpisyPage clickDodajWpisButton() {
        click(dodajWpisButton);
        return this;
    }
    public WpisyPage createWpis() {
        type(dodajTytulType,"Wpis testowy");
        type(dodajWpisType,"Ola ma kota, kot ma ole");
        click(opublikujButton);
        return this;
    }








    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/edit.php";
    private String title = "Wpisy ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
