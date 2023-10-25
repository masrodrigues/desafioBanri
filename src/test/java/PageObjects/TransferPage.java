package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferPage {
    private WebDriver driver;
    private static Waits waits;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement transferInputAccount() {
        return waits.visibilityOfElement(By.xpath("//input[@name='accountNumber']"));
    }

    public WebElement transferInputDigit() {
        return waits.visibilityOfElement(By.xpath("//input[@name='digit']"));
    }

    public WebElement transferValue() {
        return waits.visibilityOfElement(By.xpath("//input[@name='transferValue']"));
    }

    public WebElement transferDescription() {
        return waits.visibilityOfElement(By.xpath("//input[@name='description']"));
    }

    public WebElement transferButton() {
        return waits.visibilityOfElement(By.xpath("//button[@type='submit']"));
    }

    public WebElement transferOpenButton() {
        return waits.visibilityOfElement((By.id("btn-TRANSFERÊNCIA")));
    }

    public WebElement transferCloseButton() {
        return waits.visibilityOfElement((By.id("btnCloseModal")));
    }

    public WebElement transferMsgAccount() {
        return waits.visibilityOfElement(By.id("modalText"));
    }

    public WebElement transferBtnExit() {
        return waits.visibilityOfElement(By.id("btnExit"));
    }

    public WebElement transferBtnBack() {
        return waits.visibilityOfElement(By.id("btnBack"));
    }

    public WebElement transferBtnExtrato() {
        return waits.visibilityOfElement(By.id("btn-EXTRATO"));
    }

    public WebElement transferValueBalance() {
        return waits.visibilityOfElement(By.id("textBalanceAvailable"));
    }

    public WebElement transferValuePrincipal() {
        return waits.visibilityOfElement(By.id("textBalance"));
    }
}
