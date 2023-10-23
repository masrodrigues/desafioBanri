package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;
    private static Waits waits;


    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }
    public WebElement clickRegisterButton(){
        return waits.visibilityOfElement(By.cssSelector(".ihdmxA"));
    }
    public WebElement inputEmail(){
        return waits.visibilityOfElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(2) > .input__default"));
    }
    public WebElement inputName(){
        return waits.visibilityOfElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(3) > .input__default"));
    }
    public WebElement inputPassword(){
        return waits.visibilityOfElement(By.cssSelector(".login__password:nth-child(4) .input__default"));
    }
    public WebElement passwordConfirmation(){
        return waits.visibilityOfElement(By.cssSelector(".login__password:nth-child(5) .input__default"));
    }
    public WebElement accountBalanceButton(){
        return driver.findElement(By.xpath("//div//label//label[@id='toggleAddBalance']"));
    }
    public WebElement registerButton(){
        return waits.visibilityOfElement(By.cssSelector(".CMabB"));
    }
    public WebElement getBackLogin(){
        return waits.visibilityOfElement(By.id("btnBackButton"));
    }

    public static WebElement getcreateaccont(){return waits.visibilityOfElement(By.id("modalText"));}

    public static WebElement getCloseAccont(){return waits.visibilityOfElement(By.id("btnCloseModal"));}

}
