package TestCases;

import Framework.TestBase;
import Tasks.RegistrationTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CadastrarConta extends TestBase {
    private WebDriver driver = this.getDriver();
    RegistrationTask registrationTask = new RegistrationTask(driver);

    @Test
    public void realizarCadastro(){
        registrationTask.efetuarCadastro();
    }
}
