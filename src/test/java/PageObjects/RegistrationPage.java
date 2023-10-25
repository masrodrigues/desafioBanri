package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;
    private static Waits waits;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement registrationClickRegisterButton() {
        return waits.visibilityOfElement(By.cssSelector(".ihdmxA"));
    }

    public WebElement registrationInputEmail() {
        return waits.visibilityOfElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(2) > .input__default"));
    }

    public WebElement registrationInputName() {
        return waits.visibilityOfElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(3) > .input__default"));
    }

    public WebElement registrationInputPassword() {
        return waits.visibilityOfElement(By.cssSelector(".login__password:nth-child(4) .input__default"));
    }

    public WebElement registrationPasswordConfirmation() {
        return waits.visibilityOfElement(By.cssSelector(".login__password:nth-child(5) .input__default"));
    }

    public WebElement registrationAccountBalanceButton() {
        return driver.findElement(By.id("toggleAddBalance"));
    }

    public WebElement registrationRegisterButton() {
        return waits.visibilityOfElement(By.cssSelector(".CMabB"));
    }

    public WebElement registrationGetBackLogin() {
        return waits.visibilityOfElement(By.id("btnBackButton"));
    }

    public static WebElement registrationGetCreateAccount() {
        return waits.visibilityOfElement(By.id("modalText"));
    }

    public static WebElement registrationGetCloseAccount() {
        return waits.visibilityOfElement(By.id("btnCloseModal"));
    }
}

