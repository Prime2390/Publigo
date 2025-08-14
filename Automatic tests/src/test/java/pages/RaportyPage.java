package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RaportyPage extends BasePage {
    public RaportyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Znajduje się na strenie raporty");
    }
    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=publigo-sales-report";
    private String title = "Raporty ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }

}
