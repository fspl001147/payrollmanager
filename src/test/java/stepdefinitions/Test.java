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
            new ErrorCollector ( ).addError ( new Throwable ( " Something Went Wrong" ) );
        }
    }

    @And("^enter staff type as ([^\"]*) in staff type textbox for acceptability$")
    public void enterStaffTypeInStaffTypeTextboxForAcceptability (String stafftype) throws Throwable {
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), stafftype, 20 );
        new DefineStaffType ( ).getStaffTypeTextbox ( ).sendKeys ( Keys.TAB );
    }

    @Then("^verify acceptability as per ([^\"]*) in staff type textbox for acceptability$")
    public void verifyAcceptabilityInStaffTypeTextboxForAcceptability (String stafftype) throws Throwable {
        String[] A = new DefineStaffType ( ).checkvalidityInStaffTypeTextBox ( stafftype );
        String values = stafftype;
        switch (values) {
            case "staff":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff type 123":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff 123 type":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff type/":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff type-":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff / type":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            case "staff - type":
                Assert.assertEquals ( A[1], "false", A[0] );
                break;
            default:
                Assert.assertEquals ( A[1], "true", A[0] );
        }
    }

    @And("^enter staff type as ([^\"]*) in staff type textbox for length limit$")
    public void enterStaffTypeAsStaffTypeForLengthLimitInStaffTypeTextboxForLengthLimit (String stafftype) throws Throwable {

    }

    @Then("^verify acceptability as per ([^\"]*) in staff type textbox for length limit$")
    public void verifyAcceptabilityAsPerStaffTypeForLengthLimitInStaffTypeTextboxForLengthLimit (String stafftype) throws Throwable {

    }

}