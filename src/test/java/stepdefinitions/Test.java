package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Keys;
import pageobject.DefineStaff;
import pageobject.DefineStaffType;
import utilities.EventHandlingUtility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    protected EventHandlingUtility event = new EventHandlingUtility ( );
    private DefineStaffType d1 = new DefineStaffType ( );
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );
    private File file1 = new File ( "target\\cucumber_html_report\\index.html" );

    @When("^user open define staff type page$")
    public void userOpenDefineStaffTypePage ( ) throws Throwable {
        try {
            d1.openDefineStaffTypeFrame ( );
        } catch (Throwable e) {
            new ErrorCollector ( ).addError ( new Throwable ( " Something Went Wrong" ) );
        }
    }

    @Then("^verify status of menu items displayed over define staff type page at page load$")
    public void verifyStatusOfMenuItemsDisplayedOverDefineStaffTypePageAtPageLoad (DataTable table) throws Throwable {
        List <List <String>> data = table.raw ( );
        boolean staff_type_textbox = d1.getStaffTypeTextbox ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 0 ).get ( 0 ).toString ( ) + " is not active", data.get ( 0 ).get ( 1 ).toString ( ), String.valueOf ( staff_type_textbox ) );
        boolean show_on_ecare_checkbox = d1.getShowOnEcareCheckBox ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 1 ).get ( 0 ).toString ( ) + " is not active", data.get ( 1 ).get ( 1 ).toString ( ), String.valueOf ( show_on_ecare_checkbox ) );
        boolean is_hourly_paid = d1.getIsHourlyPaidCheckBox ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 2 ).get ( 0 ).toString ( ) + " is not active", data.get ( 2 ).get ( 1 ).toString ( ), String.valueOf ( is_hourly_paid ) );
        boolean save_button = d1.getSaveButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 3 ).get ( 0 ).toString ( ) + " is not active", data.get ( 3 ).get ( 1 ).toString ( ), String.valueOf ( save_button ) );
        boolean view_button = d1.getViewButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 4 ).get ( 0 ).toString ( ) + " is not active", data.get ( 4 ).get ( 1 ).toString ( ), String.valueOf ( view_button ) );
        boolean print_button = d1.getPrintButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 5 ).get ( 0 ).toString ( ) + " is not active", data.get ( 5 ).get ( 1 ).toString ( ), String.valueOf ( print_button ) );
        boolean cancel_button = d1.getCancelButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 6 ).get ( 0 ).toString ( ) + " is not active", data.get ( 6 ).get ( 1 ).toString ( ), String.valueOf ( cancel_button ) );
        boolean message_box = d1.getDefineStaffTypeMessageBox ( ).getAttribute ( "style" ).contains ( "inline" );
        Assert.assertEquals ( data.get ( 7 ).get ( 0 ).toString ( ) + " is active", data.get ( 7 ).get ( 1 ).toString ( ), String.valueOf ( message_box ) );
    }

    @And("^enter staff type as ([^\"]*) in staff type textbox for acceptability$")
    public void enterStaffTypeInStaffTypeTextboxForAcceptability (String stafftype) throws Throwable {
        event.enterText ( d1.getStaffTypeTextbox ( ), stafftype, 20 );
        d1.getStaffTypeTextbox ( ).sendKeys ( Keys.TAB );
    }

    @Then("^verify ([^\"]*) as acceptability and ([^\"]*) as message for ([^\"]*) in staff type text box$")
    public void verifyAcceptabilityAndMessageInStaffTypeTextbox (String status, String message, String stafftype) throws Throwable {
        String[] A = d1.checkvalidityInStaffTypeTextBox ( stafftype );
        Assert.assertEquals ( A[1], status, A[0] );
        Assert.assertEquals ( A[1], message, A[2] );
    }

    @And("^enter staff type as ([^\"]*) in staff type textbox for length limit$")
    public void enterStaffTypeAsStaffTypeEnteredForLengthLimitInStaffTypeTextboxForLengthLimit (String stafftype) throws Throwable {
        event.enterText ( d1.getStaffTypeTextbox ( ), stafftype, 20 );
        d1.getStaffTypeTextbox ( ).sendKeys ( Keys.TAB );
    }

    @Then("^verify ([^\"]*) as length limit and ([^\"]*) as message for ([^\"]*) in staff type textbox$")
    public void verifyAcceptabilityAsPerStaffTypeForLengthLimitInStaffTypeTextboxForLengthLimit (String status, String message, String stafftype) throws Throwable {
        String[] A = d1.checkLengthLimitInStaffTypeTextBox ( stafftype );
        Assert.assertEquals ( A[1], status, A[0] );
        Assert.assertEquals ( A[1], message, A[2] );
    }

    @And("^enter staff type as \"([^\"]*)\" and rest input fields over define staff type and$")
    public void enterStaffTypeAsAndRestInputFieldsOverDefineStaffTypeAnd (String arg0) throws Throwable {
        event.enterText ( d1.getStaffTypeTextbox ( ), arg0, 2 );
        event.click ( d1.getIsHourlyPaidCheckBox ( ), 2 );
        event.click ( d1.getShowOnEcareCheckBox ( ), 2 );
    }

    @And("^hit on cancel$")
    public void hitOnCancel ( ) throws Throwable {
        event.click ( d1.getCancelButton ( ), 3 );
    }

    @Then("^verify status of menu items displayed over define staff type page on hit of cancel$")
    public void verifyStatusOfMenuItemsDisplayedOverDefineStaffTypePageOnHitOfCancel (DataTable table) throws Throwable {
        new Test ( ).verifyStatusOfMenuItemsDisplayedOverDefineStaffTypePageAtPageLoad ( table );
    }

}