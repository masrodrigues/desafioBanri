package Tasks;

import PageObjects.LoginPage;
import Validations.LoginValidation;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;
    private LoginValidation loginValidation;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    public void efetuarLoginConta1() {

        loginPage.loginInputEmail().sendKeys("marco.rodrigues@dbserver.com.br");
        loginPage.loginInputPassword().sendKeys("senha123");
        loginPage.loginButtonAccess().click();

    }
    public void efetuarLoginConta2() {

        loginPage.loginInputEmail().sendKeys("janainafernandes@gmail.com");
        loginPage.loginInputPassword().sendKeys("senha123");
        loginPage.loginButtonAccess().click();


    }
}


