package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworksupportmethods.ReadFile;
import frameworksupportmethods.UIMap;
import utilities.EventHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;

public class GenericTestSteps {

    private File fileConfig = new File ( "configuration\\GenericConfig.properties" );
    private DriverMethods dm = new DriverMethods ( );
    private UIMap uiMap = new UIMap ( );
    private EventHandlingUtility event = new EventHandlingUtility ( );
    private ReadFile readfile = new ReadFile ( );

    @Given("^for url$")
    public void forUrl ( ) throws Throwable {
        dm.getURL ( );
    }

    @When("^user enter username and password$")
    public void userEnterUsernameAndPassword ( ) throws Throwable {
        event.enterText ( uiMap.getUsername ( ), readfile.readProperty ( fileConfig, "login" ), 10 );
        event.enterText ( uiMap.getPassword ( ), readfile.readProperty ( fileConfig, "pwd" ), 10 );
    }

    @When("^click sign in to open erp home page$")
    public void clickSignInToOpenErpHomePage ( ) throws Throwable {
        event.click ( new UIMap ( ).getSignIn ( ), 10 );
    }

    @Then("^user click payroll manager logo$")
    public void userClickPayrollManagerLogo ( ) throws Throwable {
        event.click ( new UIMap ( ).getPayrollManagerLogo ( ), 10 );
        dm.switchToWindow ( "PayRoll" );
    }

}
