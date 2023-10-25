package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.LoginPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginValidation {
    private WebDriver driver;
    private LoginPage loginPage;
    private Waits waits;

    public LoginValidation(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void validationLoginConta1() {
        try {

            boolean msgContaLoginSucesso = LoginPage.loginSairLogin().isDisplayed();

            Assertions.assertTrue(msgContaLoginSucesso, "Obrigado por escolher o nosso banco");
            Report.log(Status.PASS, "Login conta 1 realizado com sucesso", Screenshot.capture(driver));

        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao realizar login da conta - " + e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationLoginConta2() {
        try {

            boolean msgContaLoginSucesso = LoginPage.loginSairLogin().isDisplayed();

            Assertions.assertTrue(msgContaLoginSucesso, "Obrigado por escolher o nosso banco");
            Report.log(Status.PASS, "Login conta 2 realizado com sucesso", Screenshot.capture(driver));

        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao realizar login da conta - " + e.getMessage(), Screenshot.capture(driver));
        }
    }
}
