package runnerfile;


import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"featurefiles/DefineProfession.feature"}
        , glue = {"stepdefinitions"}
        , monochrome = true
        , plugin = {"pretty", "html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        , tags = {"@Scenario1"}
)
public class DefineProfessionRunner {
}
