package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProgramPartnerskiPage extends BasePage {
    public ProgramPartnerskiPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wp-idea-affiliate-program-partners";
    private String title = "Partnerzy ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
}
