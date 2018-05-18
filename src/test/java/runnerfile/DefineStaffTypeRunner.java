package runnerfile;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
//@ExtendedCucumberOptions(
//        jsonReport = "target/cucumber.json",
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        toPDF = true,
//        overviewReport = true,
//        usageReport = true,
//        overviewChartsReport = true,
//        coverageReport = true,
//        featureOverviewChart = true,
//        consolidatedReport = true,
//        outputFolder = "target/ExtendedReport"
//)
@CucumberOptions(
        features = {"featurefiles/DefineStaffType.feature"}
        , glue = {"stepdefinitions"}
        , monochrome = true
        , plugin = {"pretty:STDOUT",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml",
        "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        , tags = {"@Scenario1"}
)
public class DefineStaffTypeRunner {
    @AfterClass
    public static void reportSetup ( ) {
        System.out.println ( "pahuja Entered @AfterClass 43" );
        Reporter.loadXMLConfig ( new File ( "configuration\\extentconfig.xml" ) );
        Reporter.setSystemInfo ( "User Name", System.getProperty ( "user.name" ) );
        Reporter.setSystemInfo ( "Time Zone", System.getProperty ( "user.timezone" ) );
        Reporter.setSystemInfo ( "64 Bit", "Windows 10" );
        Reporter.setSystemInfo ( "3.1.0", "Selenium" );
        Reporter.setSystemInfo ( "1.9", "Maven" );
        Reporter.setSystemInfo ( "1.9", "Java Version" );
        Reporter.setTestRunnerOutput ( "Define Staff Type " );
//        FileConversion.convertToZip ( "output" );
//        new MailHandlingUtility ( ).sendMailWithAttachment ( scenario );
    }
}

