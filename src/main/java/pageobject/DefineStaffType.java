package pageobject;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;
import org.openqa.selenium.WebElement;
import utilities.EventHandlingUtility;
import utilities.OpenPayrollWebpage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefineStaffType extends GenericBaseClass {
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );

    public void openDefineStaffType ( ) throws IOException {
        new OpenPayrollWebpage ( ).Define_Staff_Type ( );
    }

    public void openDefineStaffTypeFrame ( ) {
        try {
            new DefineStaffType ( ).openDefineStaffType ( );
            WebElement element = new ReadFile ( ).getElement ( file, "frame" );
            boolean status = element.isDisplayed ( );
            if ( status = true ) {
                new EventHandlingUtility ( ).switchToFrame ( element, 10 );
            } else {
                System.out.println ( "Frame Not Found" );
            }
        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
    }

    public WebElement moveToDefineStaffTypeFrame ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "stafftypeclass" );
    }

    public WebElement getStaffTypeTextbox ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "stafftypetextbox" );
    }

    public WebElement getIsHourlyPaidCheckBox ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "ishourlypaidcheckbox" );
    }

    public WebElement getShowOnEcareCheckBox ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "showonecarecheckbox" );
    }

    public WebElement getSaveButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "savebutton" );
    }

    public WebElement getPrintButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "printbutton" );
    }

    public WebElement getCancelButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "cancelbutton" );
    }

    public WebElement getViewButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "viewbutton" );
    }

    public WebElement getDeleteButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "deletebutton" );
    }

    public WebElement getModifyButton ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "modifybutton" );
    }

    public List <WebElement> getSelectButton ( ) throws IOException {
        return new ReadFile ( ).getElements ( file, "selectbutton" );
    }

    public String getValidationMessage ( ) throws IOException {
        return new ReadFile ( ).getElement ( file, "messagebox" ).getAttribute ( "innerHTML" );
    }

    public boolean checkAcceptabilityInStaffTypeTextBox (String stafftype) throws IOException, InterruptedException {
        boolean status = false;
        WebElement Z1 = new DefineStaffType ( ).getStaffTypeTextbox ( );
        String enteredstafftype = Z1.getText ( );
        System.out.println ( "Staff type Entered is  :" + enteredstafftype );
        String displayedmessage = new DefineStaffType ( ).getValidationMessage ( );
        String expectedmessage = new ReadFile ( ).readProperty ( file, "messageforvalidity" );
        if ( enteredstafftype != null ) {
            Thread.sleep ( 3000 );
            if ( new ReadFile ( ).getElement ( file, "messagebox" ).isDisplayed ( ) ) {
                if ( displayedmessage.equalsIgnoreCase ( expectedmessage ) ) {
                    System.out.println ( "Entered Staff Type : '" + stafftype + "' is not aaccepted in the textbox " );
                    status = true;
                } else {
                    System.out.println ( "Something Went Wrong as the message displayed is : " + displayedmessage );
                }
            } else {
                System.out.println ( "Entered Staff Type : '" + stafftype + "' is allowed in the textbox " );
            }
        } else {
            status = true;
            System.out.println ( "Entered Staff Type : '" + stafftype + "' is not allowed in the textbox " );
        }
        return status;
    }

}
