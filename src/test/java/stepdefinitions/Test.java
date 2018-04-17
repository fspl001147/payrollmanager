package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworksupportmethods.ReadFile;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.DefineProfession;
import pageobject.DefineStaff;
import pageobject.DefineStaffType;
import utilities.EventHandlingUtility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static webdriver.AppDriver.driver;

public class Test {
    protected EventHandlingUtility event = new EventHandlingUtility ( );
    private DefineStaffType d1 = new DefineStaffType ( );
    private DefineProfession d2 = new DefineProfession ();
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );
    private File file1 = new File ( "target\\cucumber_html_report\\index.html" );

    @When("^user open define staff type page$")
    public void userOpenDefineStaffTypePage ( ) throws Throwable {
        d1.openDefineStaffTypeFrame ( );
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
        event.enterText ( d1.getStaffTypeTextbox ( ), stafftype, 2 );
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
        event.enterText ( d1.getStaffTypeTextbox ( ), stafftype, 2 );
        d1.getStaffTypeTextbox ( ).sendKeys ( Keys.TAB );
    }

    @Then("^verify ([^\"]*) as length limit and ([^\"]*) as message for ([^\"]*) in staff type textbox$")
    public void verifyAcceptabilityAsPerStaffTypeForLengthLimitInStaffTypeTextboxForLengthLimit (String status, String message, String stafftype) throws Throwable {
        String[] A = d1.checkLengthLimitInStaffTypeTextBox ( stafftype );
        Assert.assertEquals ( A[1], status, A[0] );
        Assert.assertEquals ( A[1], message, A[2] );
    }

//    @And("^click on staff type textbox$")
//    public void clickOnStaffTypeTextbox ( ) throws Throwable {
//      event.click ( d1.getStaffTypeTextbox (),2 );
//    }
//
//    @And("^click outside the textbox$")
//    public void clickOutsideTheTextbox ( ) throws Throwable {
//        d1.getStaffTypeTextbox ().sendKeys ( Keys.TAB );
//    }
//
//    @Then("^a pop up message should be displayed for mendatory field correspoding to define staff type textbox$")
//    public void aPopUpMessageShouldBeDisplayedForMendatoryFieldCorrespodingToDefineStaffTypeTextbox ( ) throws Throwable {
//        String message = d1.getDefineStaffTypeMessageBox ().getAttribute ( "innerHTML" );
//     Assert.assertFalse ( "Message is displayed : '"+message +"' " ,d1.getDefineStaffTypeMessageBox ().getAttribute ( "style" ).contains ( "inline" ) );
//     Assert.assertEquals ( new ReadFile ().readProperty ( file, "messageformandatory" ),message);
//    }
//
//    @But("^record should not be saved in define staff type table$")
//    public void recordShouldNotBeSavedInDefineStaffTypeTable ( ) throws Throwable {
//
//    }

    @And("^enter staff type as \"([^\"]*)\" and rest input fields over define staff type and$")
    public void enterStaffTypeAsAndRestInputFieldsOverDefineStaffTypeAnd (String arg0) throws Throwable {
        event.enterText ( d1.getStaffTypeTextbox ( ), arg0, 2 );
        event.click ( d1.getIsHourlyPaidCheckBox ( ), 2 );
        event.click ( d1.getShowOnEcareCheckBox ( ), 2 );
    }

    @And("^hit on cancel over define staff type page$")
    public void hitOnCancelOverDefineStaffTypePage ( ) throws Throwable {
        event.click ( d1.getCancelButton ( ), 3 );
    }

    @Then("^verify status of menu items displayed over define staff type page on hit of cancel$")
    public void verifyStatusOfMenuItemsDisplayedOverDefineStaffTypePageOnHitOfCancel (DataTable table) throws Throwable {
        new Test ( ).verifyStatusOfMenuItemsDisplayedOverDefineStaffTypePageAtPageLoad ( table );
    }

/*CASES FOR DEFINE PROFESSION*/

    @When("^user open define profession page$")
    public void userOpenDefineProfessionPage ( ) throws Throwable {
        d2.openDefineProfessionFrame ();
    }

    @Then("^verify status of menu items displayed over define profession page at page load$")
    public void verifyStatusOfMenuItemsDisplayedOverDefineProfessionPageAtPageLoad ( DataTable table) throws Throwable {
        List <List <String>> data = table.raw ( );
        boolean profession_textbox = d2.getProfessionTextBox ().isEnabled ( );
        Assert.assertEquals ( data.get ( 0 ).get ( 0 ).toString ( ) + " is not active", data.get ( 0 ).get ( 1 ).toString ( ), String.valueOf ( profession_textbox ) );
        boolean save_button = d2.getSaveButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 3 ).get ( 0 ).toString ( ) + " is not active", data.get ( 3 ).get ( 1 ).toString ( ), String.valueOf ( save_button ) );
        boolean view_button = d2.getViewButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 4 ).get ( 0 ).toString ( ) + " is not active", data.get ( 4 ).get ( 1 ).toString ( ), String.valueOf ( view_button ) );
        boolean print_button = d2.getPrintButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 5 ).get ( 0 ).toString ( ) + " is not active", data.get ( 5 ).get ( 1 ).toString ( ), String.valueOf ( print_button ) );
        boolean cancel_button = d2.getCancelButton ( ).isEnabled ( );
        Assert.assertEquals ( data.get ( 6 ).get ( 0 ).toString ( ) + " is not active", data.get ( 6 ).get ( 1 ).toString ( ), String.valueOf ( cancel_button ) );
        boolean message_box = d2.getProfessionMessageBox ().getAttribute ( "style" ).contains ( "inline" );
        Assert.assertEquals ( data.get ( 7 ).get ( 0 ).toString ( ) + " is active", data.get ( 7 ).get ( 1 ).toString ( ), String.valueOf ( message_box ) );
    }

    @And("^enter profession as <Profession Entered For Acceptability> in profession textbox for acceptability$")
    public void enterProfessionAsProfessionEnteredForAcceptabilityInProfessionTextboxForAcceptability ( ) throws Throwable {

    }

    @Then("^verify <status> as acceptability and <Displayed Message> as message for <Profession Entered For Acceptability> in profession text box$")
    public void verifyStatusAsAcceptabilityAndDisplayedMessageAsMessageForProfessionEnteredForAcceptabilityInProfessionTextBox ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }

    @And("^enter profession as <Profession Entered For Length Limit> in profession textbox for length limit$")
    public void enterProfessionAsProfessionEnteredForLengthLimitInProfessionTextboxForLengthLimit ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }

    @Then("^verify <status> as length limit and <Displayed Message> as message for <Profession Entered For Length Limit> in profession textbox$")
    public void verifyStatusAsLengthLimitAndDisplayedMessageAsMessageForProfessionEnteredForLengthLimitInProfessionTextbox ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }

    @And("^enter profession as \"([^\"]*)\" and rest input fields over define profession and$")
    public void enterProfessionAsAndRestInputFieldsOverDefineProfessionAnd (String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }

    @And("^hit on cancel over define profession page$")
    public void hitOnCancelOverDefineProfessionPage ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }

    @Then("^verify status of menu items displayed over define profession page on hit of cancel$")
    public void verifyStatusOfMenuItemsDisplayedOverDefineProfessionPageOnHitOfCancel ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }
}