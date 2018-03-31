package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworksupportmethods.GenericBaseClass;
import pageobject.DefineStaffType;
import utilities.EventHandlingUtility;

import java.util.List;


public class Test extends GenericBaseClass {

    private EventHandlingUtility event = new EventHandlingUtility ( );

    @When("^user open define staff type$")
    public void userOpenDefineStaffType ( ) throws Throwable {
        new DefineStaffType ( ).openDefineStaffTypeFrame ( );
    }

    @And("^enter values in staff type textbox for acceptability and verify on each row$")
    public void enterValuesInStaffTypeTextboxForAcceptabilityAndVerifyOnEachRow (DataTable acceptability) throws Throwable {
        List <List <String>> data = acceptability.raw ( );
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), data.get ( 0 ).get ( 1 ).toString ( ), 10 );
        Thread.sleep ( 3000 );
        event.clearText ( new DefineStaffType ( ).getStaffTypeTextbox ( ) );
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), data.get ( 1 ).get ( 1 ).toString ( ), 10 );
        Thread.sleep ( 3000 );
        event.clearText ( new DefineStaffType ( ).getStaffTypeTextbox ( ) );
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), data.get ( 2 ).get ( 1 ).toString ( ), 10 );
        Thread.sleep ( 3000 );
        event.clearText ( new DefineStaffType ( ).getStaffTypeTextbox ( ) );
        event.enterText ( new DefineStaffType ( ).getStaffTypeTextbox ( ), data.get ( 3 ).get ( 1 ).toString ( ), 10 );
        Thread.sleep ( 3000 );
        event.clearText ( new DefineStaffType ( ).getStaffTypeTextbox ( ) );
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException ( );
    }


    @When("^enter values in staff type textbox for length limit$")
    public void enter_values_in_staff_type_textbox_for_length_limit (DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException ( );
    }

    @Then("^verify the length limit of staff type textbox$")
    public void verify_the_length_limit_of_staff_type_textbox ( ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ( );
    }


}
