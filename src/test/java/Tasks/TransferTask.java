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
    public TransferTask(WebDriver driver){
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
        transferValidation = new TransferValidation(this.driver);
    }
    public static void realizarTransferenciaEntreContas() throws IOException {
        String contaFormatada = null;
        String digito = null;

        contaFormatada = FilesOperation.getProperties("primeiraConta").getProperty("numeroPrimeiraConta");
        digito = FilesOperation.getProperties("primeiraConta").getProperty("digitoPrimeiraconta");

        transferPage.transferOpenButton().click();
        transferPage.transferInputAccount().sendKeys(contaFormatada);
        transferPage.transferInputDigit().sendKeys(digito);
        transferPage.transferValue().sendKeys("500");
        transferPage.transferDescription().sendKeys("Transferência entre contas");
        transferPage.transferButton().click();
        transferValidation.validationTransferSucess();
        transferPage.transferCloseButton().click();
        transferPage.transferBtnBack().click();

    }
    public static  void validarDebitoTransfencia(){
        transferPage.transferBtnExtrato().click();
        transferValidation.validationTransferDebit();
    }
}
