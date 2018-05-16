package frameworksupportmethods;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static webdriver.AppDriver.getCurrentDriver;

public class CaptureScreenshot extends GenericBaseClass {
    public void catureScreenshot (Scenario scenario) throws IOException {
        try {
            if ( scenario.isFailed ( ) ) {
                File F = ((TakesScreenshot) getCurrentDriver ( )).getScreenshotAs ( OutputType.FILE );
                File dest = new File ( new ReadFile ( ).readProperty ( fileConfig, "screenshotpath" ) + File.separator + scenario.getSourceTagNames ( ) + File.separator + scenario.getName ()+ ".jpg" );
                File dest1 = new File ( "output/"+scenario.getName ()+".jpg" );
//                File dest = new File ( new ReadFile ( ).readProperty ( fileConfig, "screenshotpath" ) + File.separator + timestamp + ".png" );
                FileUtils.copyFile ( F, dest );
                FileUtils.copyFile ( F, dest1 );
                Reporter.addScreenCaptureFromPath ( scenario.getName ()+".jpg" );
            }
        } catch (WebDriverException e) {
            scenario.write ( e.getMessage ( ) );
        }
    }

    public String getTimeStamp ( ) {
        return new SimpleDateFormat ( "yyyyMMdd_HHmmss" ).format ( Calendar.getInstance ( ).getTime ( ) );
    }
}
