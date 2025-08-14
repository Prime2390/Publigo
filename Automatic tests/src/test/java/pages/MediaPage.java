package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MediaPage extends BasePage {
    public MediaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-videos";
    private String title = "Wideo ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
