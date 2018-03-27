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
        String login_id = readfile.readProperty ( fileConfig, "login" );
        String password = readfile.readProperty ( fileConfig, "pwd" );
        event.enterText ( uiMap.getUsername ( ), login_id );
        event.enterText ( uiMap.getPassword ( ), password );
    }

    @When("^click sign in to open erp home page$")
    public void clickSignInToOpenErpHomePage ( ) throws Throwable {
        event.click ( new UIMap ( ).getSignIn ( ) );
    }

    @Then("^user click payroll manager logo$")
    public void userClickPayrollManagerLogo ( ) throws Throwable {
        event.click ( new UIMap ( ).getPayrollManagerLogo ( ) );
    }

}
