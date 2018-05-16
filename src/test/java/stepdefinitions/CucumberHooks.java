package stepdefinitions;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import frameworksupportmethods.CaptureScreenshot;
import frameworksupportmethods.GenericBaseClass;
import org.apache.commons.mail.EmailException;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import utilities.FileConversion;
import utilities.MailHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class CucumberHooks extends GenericBaseClass {
    DriverMethods dm = new DriverMethods ( );
    CaptureScreenshot cs = new CaptureScreenshot ( );
    static MailHandlingUtility mhu = new MailHandlingUtility ( );

    @Before
    public void launchBrowser (Scenario currentscenario) throws IOException {
        this.scenario = currentscenario;
        driver = getCurrentDriver ( );
        dm.maximizeWindow ( );
    }

    @After
    public void tearDownScenario (Scenario currentscenario) throws IOException, EmailException {
        scenario.write ( "Scenario is finished" + currentscenario );
        cs.catureScreenshot ( (Scenario) scenario );
//        mhu.sendSimpleEmail ( );
        driver.close ( );
        driver.quit ( );
        driver = null;
    }

    @com.github.mkolisnyk.cucumber.runner.AfterSuite
    public static void reportSetup ( ) throws IOException, EmailException {
        Reporter.loadXMLConfig ( new File ( "configuration\\extentconfig.xml" ) );
        Reporter.setSystemInfo ( "User Name", System.getProperty ( "user.name" ) );
        Reporter.setSystemInfo ( "Time Zone", System.getProperty ( "user.timezone" ) );
        Reporter.setSystemInfo ( "64 Bit", "Windows 10" );
        Reporter.setSystemInfo ( "3.1.0", "Selenium" );
        Reporter.setSystemInfo ( "1.9", "Maven" );
        Reporter.setSystemInfo ( "1.9", "Java Version" );
        Reporter.setTestRunnerOutput ( "Define Staff Type " );
        Reporter.getExtentHtmlReport ();
        //FileConversion.convertToZip ( "output" );
        FileConversion.convertToZip ( "output" );
        mhu.sendMailWithAttachment ();
    }
}

