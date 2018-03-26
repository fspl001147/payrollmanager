package pageobject;

import frameworksupportmethods.GenericBaseClass;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefineStaffType extends GenericBaseClass {
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );

    public void openDefineStaffTypeFrame ( ) {
        try {
            openPayrollWebpage.Define_Staff_Type ( );
            event.switchToFrame ( readFile.getElement ( file, "frame" ) );

        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
    }

    public WebElement getStaffTypeTextbox ( ) throws IOException {
        return readFile.getElement ( file, "stafftypetextbox" );
    }

    public WebElement getIsHourlyPaidCheckBox ( ) throws IOException {
        return readFile.getElement ( file, "ishourlypaidcheckbox" );
    }

    public WebElement getShowOnEcareCheckBox ( ) throws IOException {
        return readFile.getElement ( file, "showonecarecheckbox" );
    }

    public WebElement getSaveButton ( ) throws IOException {
        return readFile.getElement ( file, "savebutton" );
    }

    public WebElement getPrintButton ( ) throws IOException {
        return readFile.getElement ( file, "printbutton" );
    }

    public WebElement getCancelButton ( ) throws IOException {
        return readFile.getElement ( file, "cancelbutton" );
    }

    public WebElement getViewButton ( ) throws IOException {
        return readFile.getElement ( file, "viewbutton" );

    }

    public WebElement getDeleteButton ( ) throws IOException {
        return readFile.getElement ( file, "deletebutton" );
    }

    public WebElement getModifyButton ( ) throws IOException {
        return readFile.getElement ( file, "modifybutton" );
    }

    public List <WebElement> getSelectButton ( ) throws IOException {
        return readFile.getElements ( file, "selectbutton" );
    }

}
