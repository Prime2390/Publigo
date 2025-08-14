package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PakietyPage extends BasePage{

    public PakietyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Jestem na zakładce pakiety");
    }
    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=publigo-packages";
    private String title = "Pakiety ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }

}
