package Tasks;

import Framework.Utils.FilesOperation;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import Validations.CadastroValidation;
import Validations.LoginValidation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Pattern;


public class RegistrationTask {
    private WebDriver driver;
    private RegistrationPage registrationPage;
    private CadastroValidation cadastroValidation;

    private LoginPage loginPage;
    private LoginValidation loginValidation;
    private LoginTask loginTask;
    private TransferTask transferTask;


    public RegistrationTask(WebDriver driver){
        this.driver = driver;
        registrationPage = new RegistrationPage(this.driver);
        cadastroValidation = new CadastroValidation(this.driver);
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
        transferTask = new TransferTask(this.driver);
    }
    public void efetuarCadastroConta1() throws IOException {
        registrationPage.clickRegisterButton().click();
        registrationPage.inputEmail().sendKeys("marco.rodrigues@dbserver.com.br");
        registrationPage.inputName().sendKeys("Marco Rodrigues");
        registrationPage.inputPassword().sendKeys("senha123");
        registrationPage.passwordConfirmation().sendKeys("senha123");
        registrationPage.accountBalanceButton().click();
        registrationPage.registerButton().click();
        cadastroValidation.validationCadastroConta1();
        registrationPage.getCloseAccont().click();
        loginPage.inputEmailLogin().sendKeys("marco.rodrigues@dbserver.com.br");
        loginPage.inputPasswordLogin().sendKeys("senha123");
        loginPage.buttonAccessLogin().click();
        loginValidation.validationLoginConta1();

        WebElement contaValidada = loginPage.numberAccount();
        WebElement titularConta = loginPage.nameConta();
        String nomeTitular = titularConta.getText();
        String[] partes = nomeTitular.split(" ");
        String nomeCompleto = partes[1];
        String sobreNome = partes[2];
        String conta = contaValidada.getText();
        char digito = conta.charAt(conta.length() - 1);
        String contaSemDigito = conta.replaceAll("[^0-9]", "");
        String contaFormatada = contaSemDigito.substring(0, contaSemDigito.length() - 1);

        FilesOperation.setProperty("primeiraConta", "titularPrimeiraConta", nomeCompleto);
        FilesOperation.setProperty("primeiraConta", "numeroPrimeiraConta", contaFormatada);
        FilesOperation.setProperty("primeiraConta", "digitoPrimeiraconta", String.valueOf(digito));
        FilesOperation.setProperty("primeiraConta", "saldoPrimeiraConta", "R$ 1.000,00");

        System.out.println("###################################");
        System.out.println("Cadastro Conta 1 realizado com Sucesso!");
        System.out.println(conta + " " + "Titular " + nomeCompleto + " " + sobreNome);
        System.out.println("Saldo R$ 1.000,00");
        System.out.println();




    }
    public void efetuarCadastroConta2() throws IOException {
        registrationPage.clickRegisterButton().click();
        registrationPage.inputEmail().sendKeys("janainafernandes@gmail.com");
        registrationPage.inputName().sendKeys("Janaina Fernandes");
        registrationPage.inputPassword().sendKeys("senha123");
        registrationPage.passwordConfirmation().sendKeys("senha123");
        registrationPage.accountBalanceButton().click();
        registrationPage.registerButton().click();
        cadastroValidation.validationCadastroConta1();
        registrationPage.getCloseAccont().click();
        loginPage.inputEmailLogin().sendKeys("janainafernandes@gmail.com");
        loginPage.inputPasswordLogin().sendKeys("senha123");
        loginPage.buttonAccessLogin().click();
        loginValidation.validationLoginConta2();

        WebElement contaValidada = loginPage.numberAccount();
        WebElement titularConta = loginPage.nameConta();
        String nomeTitular = titularConta.getText();
        String[] partes = nomeTitular.split(" ");
        String nomeCompleto = partes[1];
        String sobreNome = partes[2];
        String conta = contaValidada.getText();
        char digito = conta.charAt(conta.length() - 1);
        String contaSemDigito = conta.replaceAll("[^0-9]", "");
        String contaFormatada = contaSemDigito.substring(0, contaSemDigito.length() - 1);

        FilesOperation.setProperty("segundaConta", "titularSegundaConta", nomeCompleto);
        FilesOperation.setProperty("segundaConta", "numeroSegundaConta", contaFormatada);
        FilesOperation.setProperty("segundaConta", "digitoSegundaconta", String.valueOf(digito));
        FilesOperation.setProperty("segundaConta", "saldoSegundaConta", "R$ 1.000,00");

        System.out.println("###################################");
        System.out.println("Cadastro Conta 2 realizado com Sucesso!");
        System.out.println(conta + " " + "Titular " + nomeCompleto + " " + sobreNome);
        System.out.println("Saldo R$ 1.000,00");
        System.out.println();

    }
}
