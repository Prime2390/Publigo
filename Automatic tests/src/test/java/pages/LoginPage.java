package pages;

import config.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        System.out.println("Wchodzę na stronę logowania");
    }

    @FindBy(name = "log")
    private WebElement LoginType;
    @FindBy(name = "pwd")
    private WebElement PasswordType;
    @FindBy(name = "wp-submit")
    private WebElement LoginButton;

    public dashboardPage Login(){
        System.out.println("Wprowadzam email: " + PropertiesReader.read("login"));
        type(LoginType, PropertiesReader.read("login"));
        System.out.println("Wprowadzam hasło: "+ PropertiesReader.read("password"));
        type(PasswordType, PropertiesReader.read("password"));
        System.out.println("Loguje się");
        click(LoginButton);
        return new dashboardPage(driver);
    }


}
