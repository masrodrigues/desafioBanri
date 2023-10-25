package Tasks;

import org.junit.jupiter.api.Assertions;
import Framework.Utils.FilesOperation;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import PageObjects.TransferPage;
import Validations.CadastroValidation;
import Validations.LoginValidation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.io.IOException;


public class RegistrationTask {
    private WebDriver driver;
    private RegistrationPage registrationPage;
    private CadastroValidation cadastroValidation;
    private LoginPage loginPage;
    private LoginValidation loginValidation;
    private LoginTask loginTask;
    private TransferTask transferTask;
    private TransferPage transferPage;


    public RegistrationTask(WebDriver driver) {
        this.driver = driver;
        registrationPage = new RegistrationPage(this.driver);
        cadastroValidation = new CadastroValidation(this.driver);
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
        transferTask = new TransferTask(this.driver);
        transferPage = new TransferPage(this.driver);

    }

    public void efetuarCadastroConta1() throws IOException, InterruptedException {
        registrationPage.registrationClickRegisterButton().click();
        registrationPage.registrationInputEmail().sendKeys("marco.rodrigues@dbserver.com.br");
        registrationPage.registrationInputName().sendKeys("Marco Rodrigues");
        registrationPage.registrationInputPassword().sendKeys("senha123");
        registrationPage.registrationPasswordConfirmation().sendKeys("senha123");
        Thread.sleep(3000);
        registrationPage.registrationAccountBalanceButton().click();
        registrationPage.registrationRegisterButton().click();
        registrationPage.registrationGetCloseAccount().click();
        loginPage.loginInputEmail().sendKeys("marco.rodrigues@dbserver.com.br");
        loginPage.loginInputPassword().sendKeys("senha123");
        loginPage.loginButtonAccess().click();
        String saldo = transferPage.transferValuePrincipal().getText();

        WebElement contaValidada = loginPage.loginNumberAccount();
        WebElement titularConta = loginPage.loginNameConta();
        String nomeTitular = titularConta.getText();
        String[] partes = nomeTitular.split(" ");
        String nome = partes[1];
        String sobrenome = partes[2];
        String conta = contaValidada.getText();
        char digito = conta.charAt(conta.length() - 1);
        String contaSemDigito = conta.replaceAll("[^0-9]", "");
        String contaFormatada = contaSemDigito.substring(0, contaSemDigito.length() - 1);

        FilesOperation.setProperty("primeiraConta", "titularPrimeiraConta", nome + " " + sobrenome);
        FilesOperation.setProperty("primeiraConta", "numeroPrimeiraConta", contaFormatada);
        FilesOperation.setProperty("primeiraConta", "digitoPrimeiraconta", String.valueOf(digito));
        FilesOperation.setProperty("primeiraConta", "saldoPrimeiraConta", saldo);

        System.out.println("#######################################");
        System.out.println("Cadastro Conta 1 realizado com Sucesso!");
        System.out.println(conta + " " + "Titular " + nome + " " + sobrenome);
        System.out.println(saldo);
        System.out.println();

    }

    private void until(ExpectedCondition<WebElement> visibilityOf) {
    }

    public void efetuarCadastroConta2() throws IOException, InterruptedException {
        registrationPage.registrationClickRegisterButton().click();
        registrationPage.registrationInputEmail().sendKeys("janainafernandes@gmail.com");
        registrationPage.registrationInputName().sendKeys("Janaina Fernandes");
        registrationPage.registrationInputPassword().sendKeys("senha123");
        registrationPage.registrationPasswordConfirmation().sendKeys("senha123");
        Thread.sleep(3000);
        registrationPage.registrationAccountBalanceButton().click();
        registrationPage.registrationRegisterButton().click();
        registrationPage.registrationGetCloseAccount().click();
        loginPage.loginInputEmail().sendKeys("janainafernandes@gmail.com");
        loginPage.loginInputPassword().sendKeys("senha123");
        loginPage.loginButtonAccess().click();
        String saldo = transferPage.transferValuePrincipal().getText();

        WebElement contaValidada = loginPage.loginNumberAccount();
        WebElement titularConta = loginPage.loginNameConta();
        String nomeTitular = titularConta.getText();
        String[] partes = nomeTitular.split(" ");
        String nome = partes[1];
        String sobrenome = partes[2];
        String conta = contaValidada.getText();
        char digito = conta.charAt(conta.length() - 1);
        String contaSemDigito = conta.replaceAll("[^0-9]", "");
        String contaFormatada = contaSemDigito.substring(0, contaSemDigito.length() - 1);

        FilesOperation.setProperty("segundaConta", "titularSegundaConta", nome + " " + sobrenome);
        FilesOperation.setProperty("segundaConta", "numeroSegundaConta", contaFormatada);
        FilesOperation.setProperty("segundaConta", "digitoSegundaconta", String.valueOf(digito));
        FilesOperation.setProperty("segundaConta", "saldoSegundaConta", saldo);

        System.out.println("#######################################");
        System.out.println("Cadastro Conta 2 realizado com Sucesso!");
        System.out.println(conta + " " + "Titular " + nome + " " + sobrenome);
        System.out.println(saldo);
        System.out.println();

    }
}
