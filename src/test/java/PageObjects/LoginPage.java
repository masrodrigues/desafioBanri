package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private static Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement loginInputEmail() {
        return waits.visibilityOfElement(By.xpath("//input[@name='email']"));
    }

    public WebElement loginInputPassword() {
        return waits.visibilityOfElement(By.xpath("//input[@name='password']"));
    }

    public WebElement loginButtonAccess() {
        return waits.visibilityOfElement(By.xpath("//button[@type='submit']"));
    }

    public static WebElement loginNameConta() {
        return waits.visibilityOfElement(By.id("textName"));
    }

    public static WebElement loginSaudacaoInicial() {
        return waits.visibilityOfElement(By.id(".home__Footer-sc-1auj767-16 > .home__Text-sc-1auj767-9"));
    }

    public static WebElement loginSairLogin() {
        return waits.visibilityOfElement(By.id("btnExit"));
    }

    public WebElement loginNumberAccount() {
        return waits.visibilityOfElement((By.id("textAccountNumber")));
    }

    public WebElement loginCloseAccount() {
        return waits.visibilityOfElement((By.id("btnCloseModal")));
    };
}

