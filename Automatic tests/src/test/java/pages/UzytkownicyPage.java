package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UzytkownicyPage extends BasePage {
    public UzytkownicyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się w zakładce użytkownicy");
    }

    @FindBy(xpath = "//*[@id=\"table-view-container\"]/div[1]/div[1]/a")
    private WebElement dodajNowegoUzytkownikaButton;
    public void dodajNowegoUzytkownika() {
        click(dodajNowegoUzytkownikaButton);
    }
    @FindBy



    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-users";
    private String title = "Użytkownicy ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
