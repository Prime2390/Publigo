package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TagiProduktowePage extends BasePage {
    public TagiProduktowePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje sie w zakładce tagi produktowe");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/edit-tags.php?taxonomy=download_tag&post_type=download";
    private String title = "Tagi ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
