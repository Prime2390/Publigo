package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SprzedazPage extends BasePage {
    public SprzedazPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Jestem w zakładce Zwieksz sprzedaz");
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=publigo-increasing-sales";
    private String title = "Zwiększ sprzedaż ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
