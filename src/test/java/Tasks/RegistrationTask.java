package Tasks;

import PageObjects.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationTask {

    private WebDriver driver;
    private RegistrationPage registrationPage;
    public RegistrationTask(WebDriver driver){
        this.driver = driver;
        registrationPage = new RegistrationPage(this.driver);
    }
    public void efetuarCadastro(){
        registrationPage.clickRegisterButton().click();
        registrationPage.inputEmail().sendKeys("marco2.rodrigues@dbserver.com.br");
        registrationPage.inputName().sendKeys("Marco2 Rodrigues");
        registrationPage.inputPassword().sendKeys("senha123");
        registrationPage.passwordConfirmation().sendKeys("senha123");
        registrationPage.accountBalance().click();
        registrationPage.registerButton().click();

    }
}
