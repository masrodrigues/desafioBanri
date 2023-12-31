package Framework.Report;

import Framework.Utils.CreateFolder;
import Framework.Utils.DateTime;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {

    private static final String PATH_SCREENSHOT = ReportFactory.PATH_REPORT + File.separator + "Screenshot";

    public static Media capture(WebDriver driver){
        try{
            CreateFolder.createFolderReport(PATH_SCREENSHOT);
            File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String screenshot = PATH_SCREENSHOT + File.separator + "Image_" + DateTime.getDateFormatScreenshot() + ".png";
            FileUtils.copyFile(scrshot, new File(screenshot));
            return MediaEntityBuilder.createScreenCaptureFromPath(screenshot).build();

        }catch (Exception e){
            String message = "Ocorreu erro ao capturar a tela";
        }

        return null;
    }


}
