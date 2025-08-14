package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NarzedziaPage extends BasePage {
    public NarzedziaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się w zakładce narzedzia");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-tools";
    private String title = "Narzędzia ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
