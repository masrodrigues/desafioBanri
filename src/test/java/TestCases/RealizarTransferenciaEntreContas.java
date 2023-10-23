package TestCases;

import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.RegistrationTask;
import Tasks.TransferTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RealizarTransferenciaEntreContas extends TestBase {
    private WebDriver driver = this.getDriver();

    RegistrationTask registrationTask = new RegistrationTask(driver);
    LoginTask loginTask = new LoginTask(driver);
    TransferTask transferTask = new TransferTask(driver);
    private static int testCount = 0;
    @Test
    @Order(1)

    public void efetuarCadastroConta1() {

        try {
            Report.createTest("Realizar Cadastro conta 1 com sucesso", ReportType.SINGLE);
            registrationTask.efetuarCadastroConta1();

        } catch (Exception e) {

            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

        }
        testCount++;
    }

    @Test
    @Order(2)
    public void efetuarCadastroConta2() {

        try {
            Report.createTest("Realizar Cadastro conta 2 com sucesso", ReportType.SINGLE);
            registrationTask.efetuarCadastroConta2();
        } catch (Exception e) {

            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

        }
        testCount++;
    }

    @Test
    @Order(3)
    public void realizarTransferenciaEntreContas() {

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
    public void ValidarExtratoDebito() {

        try {
        loginTask.efetuarLoginConta2();
        transferTask.validarDebitoTransfencia();
        } catch (Exception e) {
        }
    }
    @AfterEach
    public void finish(){
        // Se todos os testes foram executados, então feche o driver
        if (testCount == 4) {
            quitDriver();
        }
        Report.close();
    }
}