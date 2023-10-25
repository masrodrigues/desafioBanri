package TestCases;

import Validations.CadastroValidation;
import org.junit.jupiter.api.Assertions;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.RegistrationTask;
import Tasks.TransferTask;
import Validations.LoginValidation;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RealizarTransferenciaEntreContas extends TestBase {
    private WebDriver driver = this.getDriver();
    private static int testCount = 0;
    RegistrationTask registrationTask = new RegistrationTask(driver);
    CadastroValidation cadastroValidation = new CadastroValidation(driver);
    LoginValidation loginValidation = new LoginValidation(driver);
    LoginTask loginTask = new LoginTask(driver);
    TransferTask transferTask = new TransferTask(driver);


    @Test
    @Order(1)

    public void EfetuarCadastroConta1() {

        try {
            Report.createTest("Realizar Cadastro conta 1 com sucesso", ReportType.SINGLE);
            registrationTask.efetuarCadastroConta1();

            loginValidation.validationLoginConta1();


        } catch (Exception e) {

            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

        }
        testCount++;
    }

    @Test
    @Order(2)
    public void EfetuarCadastroConta2() {

        try {
            Report.createTest("Realizar Cadastro conta 2 com sucesso", ReportType.SINGLE);
            registrationTask.efetuarCadastroConta2();

            loginValidation.validationLoginConta2();
        } catch (Exception e) {

            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

        }
        testCount++;
    }

    @Test
    @Order(3)
    public void RealizarTransferenciaEntreContas() {

        try {
            Report.createTest("Realizar transferência com sucesso", ReportType.SINGLE);
            loginTask.efetuarLoginConta2();
            transferTask.realizarTransferenciaEntreContas();
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
        testCount++;
    }

    @Test
    @Order(4)
    public void ValidarExtratoCredito() {

        try {
            Report.createTest("Validar crédito após transferência", ReportType.SINGLE);
            loginTask.efetuarLoginConta1();
            transferTask.validarCreditoTransferencia();
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
        testCount++;

    }

    @Test
    @Order(5)
    public void ValidarExtratoDebito() {

        try {
            Report.createTest("Validar débito após transferência", ReportType.SINGLE);
            loginTask.efetuarLoginConta2();
            transferTask.validarDebitoTransfencia();
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
        testCount++;
    }

    @AfterEach
    public void finish() {
        if (testCount == 5) {
            quitDriver();
        }
        Report.close();
    }
}