package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UstawieniaPage extends BasePage {
    public UstawieniaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się w zakładce ustawienia");
    }
    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-settings&autofocus=general";
    private String title = "Ustawienia ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
