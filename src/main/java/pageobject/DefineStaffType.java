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

    public void openDefineStaffTypeFrame ( ) {
        try {
            new OpenPayrollWebpage ( ).Define_Staff_Type ( );
            new EventHandlingUtility ( ).switchToFrame ( new ReadFile ( ).getElement ( file, "frame" ), 20 );

        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
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

}
