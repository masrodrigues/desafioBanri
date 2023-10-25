package Tasks;

import Framework.Utils.FilesOperation;
import PageObjects.TransferPage;
import Validations.TransferValidation;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TransferTask {
    private WebDriver driver;
    private static TransferPage transferPage;
    private RegistrationTask registrationTask;
    private static TransferValidation transferValidation;

    public TransferTask(WebDriver driver) {
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
        transferValidation = new TransferValidation(this.driver);
    }

    public static void realizarTransferenciaEntreContas() throws IOException {
        String contaFormatada = null;
        String digito = null;

        String contaFormatada2 = null;
        String digito2 = null;

        contaFormatada = FilesOperation.getProperties("primeiraConta").getProperty("numeroPrimeiraConta");
        digito = FilesOperation.getProperties("primeiraConta").getProperty("digitoPrimeiraconta");

        contaFormatada2 = FilesOperation.getProperties("segundaConta").getProperty("numeroSegundaConta");
        digito2 = FilesOperation.getProperties("segundaConta").getProperty("digitoSegundaconta");

        transferPage.transferOpenButton().click();
        transferPage.transferInputAccount().sendKeys(contaFormatada);
        transferPage.transferInputDigit().sendKeys(digito);
        transferPage.transferValue().sendKeys("850");
        transferPage.transferDescription().sendKeys("Transferência entre contas");
        transferPage.transferButton().click();
        transferValidation.validationTransferSucess();
        transferPage.transferCloseButton().click();
        transferPage.transferBtnBack().click();

        System.out.println("#######################################");
        System.out.println("Tranferencia no valor de R$ 850,00");
        System.out.println("Realizada da conta origem " + contaFormatada2 + "-" + digito2);
        System.out.println("Para a conta destino " + contaFormatada + "-" + digito);

    }

    public static void validarCreditoTransferencia() throws IOException {

        String contaFormatada = null;
        String digito = null;

        contaFormatada = FilesOperation.getProperties("primeiraConta").getProperty("numeroPrimeiraConta");
        digito = FilesOperation.getProperties("primeiraConta").getProperty("digitoPrimeiraconta");

        transferPage.transferBtnExtrato().click();
        String saldo = transferPage.transferValueBalance().getText();
        transferValidation.validationTransferCredit();

        System.out.println("#######################################");
        System.out.println("Saldo Atualizado conta 1 nº " + contaFormatada + "-" + digito);
        System.out.println(saldo);
        System.out.println();

    }

    public static void validarDebitoTransfencia() throws IOException {

        String contaFormatada2 = null;
        String digito2 = null;

        contaFormatada2 = FilesOperation.getProperties("segundaConta").getProperty("numeroSegundaConta");
        digito2 = FilesOperation.getProperties("segundaConta").getProperty("digitoSegundaconta");

        transferPage.transferBtnExtrato().click();
        String saldo = transferPage.transferValueBalance().getText();
        transferValidation.validationTransferDebit();

        System.out.println("#######################################");
        System.out.println("Saldo restande conta 2 nº " + contaFormatada2 + "-" + digito2);
        System.out.println(saldo);
        System.out.println();
    }

}
