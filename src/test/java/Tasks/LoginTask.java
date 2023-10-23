package Tasks;

import PageObjects.LoginPage;
import Validations.LoginValidation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;
    private LoginValidation loginValidation;
    public LoginTask(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    public void efetuarLoginConta1() {
        loginPage.inputEmailLogin().sendKeys("marco.rodrigues@dbserver.com.br");
        loginPage.inputPasswordLogin().sendKeys("senha123");
        loginPage.buttonAccessLogin().click();

        }
    public void efetuarLoginConta2() {
        loginPage.inputEmailLogin().sendKeys("marco2.rodrigues@dbserver.com.br");
        loginPage.inputPasswordLogin().sendKeys("senha123");
        loginPage.buttonAccessLogin().click();

    }
    }


