package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import frameworksupportmethods.CaptureScreenshot;
import webdriver.DriverMethods;

import java.io.IOException;
import java.util.Collection;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class CucumberHooks {
    static Collection <String> scenario = null;
    DriverMethods dm = new DriverMethods ( );
    CaptureScreenshot cs = new CaptureScreenshot ( );

   @Before
    public void getScenario (Scenario sc) {
        scenario = sc.getSourceTagNames ( );
    }

    @Before
    public void launchBrowser ( ) throws IOException {
        driver = getCurrentDriver ( );
        dm.maximizeWindow ( );
    }

   /* @After
    public void afterScenario () throws IOException {
        cs.catureScreenshot ( );
    }*/

    @After
    public void closeBrowser ( ) throws IOException {
        dm.waitImplicitly ( 1000 );
        cs.catureScreenshot ( (Scenario) scenario );
        driver.close ( );
        driver.quit ( );
        driver = null;
    }

}

