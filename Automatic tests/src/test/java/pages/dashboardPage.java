package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage extends BasePage {

    public dashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Jestem na stronie głównej");

    }
    @FindBy(xpath = "//*[@id=\"adminmenu\"]/li[2]/a/div[1]")
    private WebElement getPakietyPage;

    public PakietyPage getPakietyPage() {
        System.out.println("Klikam w zakładkę pakiety");
        click(getPakietyPage);
        return new PakietyPage(driver);
    }
    @FindBy(xpath = "//*[@id=\"adminmenu\"]/li[3]/a/div[1]")
    private WebElement getKategoriePage;

    public KategoriePage getKategoriePage(){
        System.out.println("Klikam w zakładke kategorie");
        click(getKategoriePage);
        return new KategoriePage(driver);
    }
    @FindBy(xpath = "//*[@id='adminmenu']/li[4]/a/div[1]")
    private WebElement getTagiProduktowePage;

    public TagiProduktowePage getTagiProduktowePage() {
        System.out.println("Klikam w zakładkę Tagi produktowe");
        click(getTagiProduktowePage);
        return new TagiProduktowePage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[5]/a/div[1]")
    private WebElement getAnkietyPage;

    public AnkietyPage getAnkietyPage() {
        System.out.println("Klikam w zakładkę Ankiety");
        click(getAnkietyPage);
        return new AnkietyPage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[6]/a/div[1]")
    private WebElement getProgramPartnerskiPage;

    public ProgramPartnerskiPage getProgramPartnerskiPage() {
        System.out.println("Klikam w zakładkę Program partnerski");
        click(getProgramPartnerskiPage);
        return new ProgramPartnerskiPage(driver);
    }



    @FindBy(xpath = "//*[@id='adminmenu']/li[8]/a/div[1]")
    private WebElement getZwiekssprzedazPage;

    public SprzedazPage getSprzedazPage() {
        System.out.println("Klikam w zakładkę Zwiększ sprzedaż");
        click(getZwiekssprzedazPage);
        return new SprzedazPage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[9]/a/div[1]")
    private WebElement getRaportyPage;

    public RaportyPage getRaportyPage() {
        System.out.println("Klikam w zakładkę Raporty");
        click(getRaportyPage);
        return new RaportyPage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[10]/a/div[1]")
    private WebElement getPomocPage;

    public PomocPage getPomocPage() {
        System.out.println("Klikam w zakładkę Pomoc");
        click(getPomocPage);
        return new PomocPage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[12]/a/div[1]")
    private WebElement getMediaPage;

    public MediaPage getMediaPage() {
        System.out.println("Klikam w zakładkę Media");
        click(getMediaPage);
        return new MediaPage(driver);
    }


    @FindBy(xpath = "//*[@id='adminmenu']/li[13]/a/div[1]")
    private WebElement getStronyPage;

    public StronyPage getStronyPage() {
        System.out.println("Klikam w zakładkę Strony");
        click(getStronyPage);
        return new StronyPage(driver);
    }

    @FindBy(xpath = "//*[@id='adminmenu']/li[14]/a/div[1]")
    private WebElement getWpisyPage;

    public WpisyPage getWpisyPage() {
        System.out.println("Klikam w zakładkę Wpisy");
        click(getWpisyPage);
        return new WpisyPage(driver);
    }

        @FindBy(xpath = "//*[@id='adminmenu']/li[15]/a/div[1]")
        private WebElement getKomentarzePage;

        public KomentarzePage getKomentarzePage() {
            System.out.println("Klikam w zakładkę Komentarze");
            click(getKomentarzePage);
            return new KomentarzePage(driver);
        }

        @FindBy(xpath = "//*[@id='adminmenu']/li[16]/a/div[1]")
        private WebElement getUzytkownicyPage;

        public UzytkownicyPage getUzytkownicyPage() {
            System.out.println("Klikam w zakładkę Użytkownicy");
            click(getUzytkownicyPage);
            return new UzytkownicyPage(driver);
        }

        @FindBy(xpath = "//*[@id='adminmenu']/li[17]/a/div[1]")
        private WebElement getUstawieniaPage;

        public UstawieniaPage getUstawieniaPage() {
            System.out.println("Klikam w zakładkę Ustawienia");
            click(getUstawieniaPage);
            return new UstawieniaPage(driver);
        }

        @FindBy(xpath = "//*[@id='adminmenu']/li[18]/a/div[1]")
        private WebElement getNarzędziaPage;

        public NarzedziaPage getNarzędziaPage() {
            System.out.println("Klikam w zakładkę Narzędzia");
            click(getNarzędziaPage);
            return new NarzedziaPage(driver);
        }
        @FindBy(xpath = "//*[@id=\"toplevel_page_wp-idea-payment-history\"]/a/div[1]")
        private WebElement getZamowieniaPage;

    public ZamuwieniaPage getZamowieniaPage() {
        System.out.println("Klikam w zakładkę Zamowienia");
        click(getZamowieniaPage);
        return new ZamuwieniaPage(driver);
    }

    private String url = "https://mmrmqpr585.publigo.onl/wp-admin/admin.php?page=wpidea-dashboard";
    private String title = "Kokpit ‹ Platforma kursów online 2 — WordPress";

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }

}
