package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Keys;
import pageobject.DefineStaffType;
import utilities.EventHandlingUtility;

import java.io.File;

public class Test {
    protected EventHandlingUtility event = new EventHandlingUtility ( );
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );
    private File file1 = new File ( "target\\cucumber_html_report\\index.html" );

    @When("^user open define staff type page$")
    public void user_open_define_staff_type_page ( ) throws Throwable {
        try {
            new DefineStaffType ( ).openDefineStaffTypeFrame ( );
        } catch (Throwable e) {
            new ErrorCollector ( ).addError ( new Throwable ( "Something Went Wrong" ) );
        }
    }

    @And("^enter staff type as ([^\"]*) in staff type textbox$")
    public void enter_staff_type_in_staff_type_textbox (String stafftype) throws Throwable {
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), stafftype, 20 );
        new DefineStaffType ( ).getStaffTypeTextbox ( ).sendKeys ( Keys.TAB );
        //event.click ( new DefineStaffType ().moveToDefineStaffTypeFrame (),10 );
    }

    @Then("^verify acceptability as per ([^\"]*) in staff type textbox$")
    public void verify_acceptability_in_staff_type_textbox (String stafftype) throws Throwable {
        String[] A = new DefineStaffType ( ).checkvalidityInStaffTypeTextBox ( stafftype );
        String values = stafftype;
        switch (values) {
            case "staff":
                Assert.assertEquals ( "false", A[0] );
                System.out.println ( A[1] );
                break;
            case "123 staff type":
                Assert.assertEquals ( "true", A[0] );
                System.out.println ( A[1] );
                break;
            case "staff type 123":
                Assert.assertEquals ( "false", A[0] );
                System.out.println ( A[1] );
                break;
        }
    }

}