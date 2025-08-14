package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KategoriePage extends BasePage {

    public KategoriePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się na zakładke kategorie");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/edit-tags.php?taxonomy=download_category&post_type=download";
    private String title = "Kategorie ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
