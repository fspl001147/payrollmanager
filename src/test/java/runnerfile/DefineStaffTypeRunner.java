package runnerfile;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import frameworksupportmethods.GenericBaseClass;
import org.junit.runner.RunWith;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
        detailedReport = true,
        detailedAggregatedReport = true,
        toPDF = true,
        overviewReport = true,
        usageReport = true,
        overviewChartsReport = true,
        coverageReport = true,
        featureOverviewChart = true,
        consolidatedReport = true,
        outputFolder = "target/ExtendedReport"
)
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
public class DefineStaffTypeRunner extends GenericBaseClass {
}
