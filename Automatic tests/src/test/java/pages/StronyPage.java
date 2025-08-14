package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StronyPage extends BasePage {
    public StronyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się na zakładce Strony");
    }
    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/edit.php?post_type=page";
    private String title = "Strony ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
