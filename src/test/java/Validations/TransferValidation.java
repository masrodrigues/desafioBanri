package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.TransferPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class TransferValidation {
    private WebDriver driver;
    private TransferPage transferPage;

    private Waits waits;

    public TransferValidation(WebDriver driver) {
        this.driver = driver;
        transferPage = new TransferPage(this.driver);
    }

    public void validationTransferSucess() {
        try {

            boolean msgTranferenciaRealizadaSucesso = transferPage.transferMsgAccount().isDisplayed();

            Assertions.assertTrue(msgTranferenciaRealizadaSucesso, "Transferencia realizada com sucesso");
            Report.log(Status.PASS, "Transferencia realizada com sucesso", Screenshot.capture(driver));

        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao realizar a transferência - " + e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationTransferDebit() {
        try {
            String valorDebitoTransferencia = transferPage.transferValueBalance().getText();
            String valorEsperado = "R$ 150,00";

            Assertions.assertEquals(valorDebitoTransferencia, valorEsperado);
            Report.log(Status.PASS, "Transferencia debitada no valor de " + valorEsperado + " conta Origem", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao validar o débito - " + e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationTransferCredit() {
        try {
            String valorDebitoTransferencia = transferPage.transferValueBalance().getText();
            String valorEsperado = "R$ 1.850,00";

            Assertions.assertEquals(valorDebitoTransferencia, valorEsperado);
            Report.log(Status.PASS, "Transferencia creditada no valor de " + valorEsperado + " conta destino", Screenshot.capture(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Erro ao validar o crédito - " + e.getMessage(), Screenshot.capture(driver));
        }
    }
}