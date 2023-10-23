package PageObjects;

import Framework.Browser.Waits;
import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {


    private WebDriver driver;
    private static Waits waits;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement inputEmailLogin() {
        return waits.visibilityOfElement(By.cssSelector(".style__ContainerFormLogin-sc-1wbjw6k-0 > .style__ContainerFieldInput-sc-s3e9ea-0 > .input__default"));
    }
    public WebElement inputPasswordLogin(){
        return waits.visibilityOfElement(By.xpath("//input[@name='password']"));
    }
    public WebElement buttonAccessLogin(){
        return waits.visibilityOfElement(By.xpath("//button[@type='submit']"));
    }

    public static WebElement nameConta(){
        return waits.visibilityOfElement(By.id("textName"));
}
    public static WebElement saudacaoInicial() {
        return waits.visibilityOfElement(By.id(".home__Footer-sc-1auj767-16 > .home__Text-sc-1auj767-9"));
    }
    public static WebElement sairLogin()
    {return waits.visibilityOfElement(By.id("btnExit"));
}
    public WebElement numberAccount(){
        return waits.visibilityOfElement((By.id("textAccountNumber")));
    }
    public WebElement closeAccont(){ return waits.visibilityOfElement((By.id("btnCloseModal")));};
}
