package pageobject;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;
import frameworksupportmethods.SupportClasses;
import org.openqa.selenium.WebElement;
import utilities.EventHandlingUtility;
import utilities.OpenPayrollWebpage;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefineStaffType extends GenericBaseClass {
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );
    DriverMethods dm = new DriverMethods ( );

    public void openDefineStaffType ( ) throws Exception {
        new OpenPayrollWebpage ( ).Define_Staff_Type ( );
    }

    public void openDefineStaffTypeFrame ( ) throws Exception {
        try {
            new DefineStaffType ( ).openDefineStaffType ( );
            WebElement element = new ReadFile ( ).getElement ( file, "frame", 5 );
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

    public WebElement moveToDefineStaffTypeFrame ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "stafftypeclass", 5 );
    }

    public WebElement getStaffTypeTextbox ( ) throws Exception {
        //dm.waitExplicitly (  new ReadFile ( ).getElement ( file, "stafftypetextbox" ),5 );
        return new ReadFile ( ).getElement ( file, "stafftypetextbox", 5 );
    }

    public WebElement getIsHourlyPaidCheckBox ( ) throws Exception {
        //   dm.waitExplicitly (new ReadFile ( ).getElement ( file, "ishourlypaidcheckbox" ),5  );
        return new ReadFile ( ).getElement ( file, "ishourlypaidcheckbox", 5 );
    }

    public WebElement getShowOnEcareCheckBox ( ) throws Exception {
        //dm.waitExplicitly (new ReadFile ( ).getElement ( file, "showonecarecheckbox" ),5  );
        return new ReadFile ( ).getElement ( file, "showonecarecheckbox", 5 );
    }

    public WebElement getSaveButton ( ) throws Exception {
        // dm.waitExplicitly (new ReadFile ( ).getElement ( file, "savebutton" ),5  );
        return new ReadFile ( ).getElement ( file, "savebutton", 5 );
    }

    public WebElement getPrintButton ( ) throws Exception {
        //   dm.waitExplicitly (new ReadFile ( ).getElement ( file, "printbutton" ),5  );
        return new ReadFile ( ).getElement ( file, "printbutton", 5 );
    }

    public WebElement getCancelButton ( ) throws Exception {
        // dm.waitExplicitly (new ReadFile ( ).getElement ( file, "cancelbutton" ),5  );
        return new ReadFile ( ).getElement ( file, "cancelbutton", 5 );
    }

    public WebElement getViewButton ( ) throws Exception {
        //  dm.waitExplicitly (new ReadFile ( ).getElement ( file, "viewbutton" ),5  );
        return new ReadFile ( ).getElement ( file, "viewbutton", 5 );
    }

    public WebElement getDeleteButton ( ) throws Exception {
        //  dm.waitExplicitly (new ReadFile ( ).getElement ( file, "deletebutton" ),5  );
        return new ReadFile ( ).getElement ( file, "deletebutton", 5 );
    }

    public WebElement getModifyButton ( ) throws Exception {
        //dm.waitExplicitly (new ReadFile ( ).getElement ( file, "modifybutton" ),5  );
        return new ReadFile ( ).getElement ( file, "modifybutton", 5 );
    }

    public List <WebElement> getSelectButton ( ) throws IOException {
        //   dm.waitExplicitly (new ReadFile ( ).getElement ( file, "selectbutton" ),5  );
        return new ReadFile ( ).getElements ( file, "selectbutton", 5 );
    }

    public WebElement getValidationMessageBox ( ) throws Exception {
        //   dm.waitExplicitly (new ReadFile ( ).getElement ( file, "messagebox" ),5  );
        return new ReadFile ( ).getElement ( file, "messagebox", 5 );
    }

    public String[] checkvalidityInStaffTypeTextBox (String stafftype) throws Exception {
        return new SupportClasses ( ).checkValidityInTextBox ( file, "stafftypetextbox", "messageforvalidity", "messagebox", stafftype );
    }

    public String[] checkLengthLimitInStaffTypeTextBox (String stafftype) throws Exception {
        return new SupportClasses ( ).checkLengthOfTextBox ( file, "stafftypetextbox", "messageforlength", "messagebox", stafftype );
    }
}