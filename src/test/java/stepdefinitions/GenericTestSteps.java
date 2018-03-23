package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworksupportmethods.ReadFile;
import frameworksupportmethods.UIMap;
import pageobject.DefineProfession;
import pageobject.EstimatedSalaryReport;
import utilities.EventHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;

public class GenericTestSteps {
    private File fileConfig = new File ( "configuration\\GenericConfig.properties" );
    private DriverMethods dm = new DriverMethods ( );
    private EventHandlingUtility event = new EventHandlingUtility ( );
    private ReadFile readfile = new ReadFile ( );

    @Given("^for url$")
    public void for_url ( ) throws Throwable {
        dm.getURL ( );
    }

    @When("^user enter username and password$")
    public void user_enter_username_and_password ( ) throws Throwable {
        event.enterText ( new UIMap ( ).getUsername ( ), readfile.readProperty ( fileConfig, "login" ) );
        event.enterText ( new UIMap ( ).getPassword ( ), readfile.readProperty ( fileConfig, "pwd" ) );
    }

    @When("^click sign in to open erp home page$")
    public void click_sign_in_to_open_erp_home_page ( ) throws Throwable {
        event.click ( new UIMap ( ).getSignIn ( ) );
    }

    @Then("^user click payroll manager logo$")
    public void user_click_payroll_manager_logo ( ) throws Throwable {
        event.click ( new UIMap ( ).getPayrollManagerLogo ( ) );
    }

    @When("^user open define profession$")
    public void user_open_define_profession ( ) throws Throwable {
        new DefineProfession ( ).openDefineProfessionFrame ( );
    }

    @When("^user open estimated salary report$")
    public void user_open_estimated_salary_report ( ) throws Throwable {
        new EstimatedSalaryReport ( ).openEstimatedSalaryReportFrame ( );
    }


}
