package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KomentarzePage extends BasePage {
    public KomentarzePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się w zakładce komentarze");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/edit-comments.php";
    private String title = "Komentarze ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
