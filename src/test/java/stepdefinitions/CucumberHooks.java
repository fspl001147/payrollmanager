package stepdefinitions;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import frameworksupportmethods.CaptureScreenshot;
import frameworksupportmethods.GenericBaseClass;
import org.apache.commons.mail.EmailException;
import utilities.FileConversion;
import utilities.MailHandlingUtility;
import webdriver.DriverMethods;

import java.io.IOException;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class CucumberHooks extends GenericBaseClass {
    static MailHandlingUtility mhu = new MailHandlingUtility ( );
    private static boolean dunit = false;
    DriverMethods dm = new DriverMethods ( );
    CaptureScreenshot cs = new CaptureScreenshot ( );


    @Before
    public void launchBrowser (Scenario currentscenario) throws IOException {
        System.out.println ( "pahuja @Before" );
        this.scenario = currentscenario;
        driver = getCurrentDriver ( );
        dm.maximizeWindow ( );
    }

    //    @Before
//    public void beforeAll() {
//        if(!dunit) {
//            Runtime.getRuntime().addShutdownHook(new Thread (  ));
//            // do the beforeAll stuff...
//            dunit = true;
//        }
//    }

    @After
    public void tearDownScenario (Scenario currentscenario) throws IOException, EmailException {
        System.out.println ( "pahuja @After 31" );
        scenario.write ( "Scenario is finished" + currentscenario );
        cs.catureScreenshot ( (Scenario) scenario );
        driver.close ( );
        driver.quit ( );
        driver = null;
    }

    @After
    public void afterAll ( ) {
        Runtime.getRuntime ( ).addShutdownHook ( new Thread ( ) {
            public void run ( ) {
                FileConversion.convertToZip ( "output" );
                try {
                    new MailHandlingUtility ().sendMailWithAttachment ( );
                } catch (EmailException e) {
                    e.printStackTrace ( );
                } catch (IOException e) {
                    e.printStackTrace ( );
                }
            }
        } );
    }

}

