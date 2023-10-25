package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.RegistrationPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CadastroValidation {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    private Waits waits;

    public CadastroValidation(WebDriver driver) {
        this.driver = driver;
        registrationPage = new RegistrationPage(this.driver);
    }

    public void validationCadastroConta1() {
        try {

            String msgContaCriadaSucesso = RegistrationPage.registrationGetCreateAccount().getText();
            String msgEsperada = "foi criada com sucesso";

            Assertions.assertTrue(msgContaCriadaSucesso.contains(msgEsperada), "A mensagem de criação de conta não esta presente");
            Report.log(Status.PASS, "Cadastro da conta 1 realizado com sucesso", Screenshot.capture(driver));

        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao realizar o cadastro da conta" + e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationCadastroConta2() {
        try {

            String msgContaCriadaSucesso = RegistrationPage.registrationGetCreateAccount().getText();
            String msgEsperada = "foi criada com sucesso";

            Assertions.assertTrue(msgContaCriadaSucesso.contains(msgEsperada), "A mensagem de criação de conta não esta presente");
            Report.log(Status.PASS, "Cadastro da conta 2 realizado com sucesso", Screenshot.capture(driver));

        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao realizar o cadastro da conta" + e.getMessage(), Screenshot.capture(driver));
        }
    }

}
