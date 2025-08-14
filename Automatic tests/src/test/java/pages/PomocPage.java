package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PomocPage extends BasePage {
    public PomocPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się na stronie pomoc");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-support";
    private String title = "Pomoc ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
