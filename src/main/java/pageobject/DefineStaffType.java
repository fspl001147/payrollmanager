package pageobject;

import frameworksupportmethods.*;
import org.openqa.selenium.WebElement;
import utilities.EventHandlingUtility;
import utilities.OpenPayrollWebpage;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DefineStaffType extends GenericBaseClass {
    DriverMethods dm = new DriverMethods ( );
    private File file = new File ( "configuration\\pageproperties\\DefineStaffType.properties" );

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
            }
        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
    }

    public WebElement getStaffTypeTextbox ( ) throws Exception {
        dm.waitImplicitly ( 3 );
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
        dm.waitImplicitly ( 3 );
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

    public boolean getViewGrid()throws Exception{
        return new ReadFile ().getElement ( file, "gridatview",3 ).isEnabled ();
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

    public WebElement getDefineStaffTypeMessageBox ( ) throws Exception {
        //   dm.waitExplicitly (new ReadFile ( ).getElement ( file, "messagebox" ),5  );
        return new ReadFile ( ).getElement ( file, "messagebox", 5 );
    }

    public String[] checkvalidityInStaffTypeTextBox (String stafftype) throws Exception {
        return new SupportClasses ( ).checkValidityInTextBox ( file, new DefineStaffType ( ).getStaffTypeTextbox ( ), "messageforvalidity", new DefineStaffType ( ).getDefineStaffTypeMessageBox ( ), "Define Staff Type", stafftype );
    }

    public String[] checkLengthLimitInStaffTypeTextBox (String stafftype) throws Exception {
        return new SupportClasses ( ).checkLengthOfTextBox ( file, new DefineStaffType ( ).getStaffTypeTextbox ( ), "messageforlength", new DefineStaffType ( ).getDefineStaffTypeMessageBox ( ), "Define Staff Type", stafftype, 50 );
    }

    public boolean checkIsEmptyViewGridData() throws Exception {
        return new ReadFile().getElement ( file, "emptyrow" ,2).isDisplayed ();
    }

//    public void getAllSavedRecord ( ) throws IOException, SQLException {
//        ArrayList <String> A = new ArrayList <> ( );
//        ExecuteScript eS = new ExecuteScript ( );
//        ResultSet rs = eS.execScript ( new ReadFile ( ).readProperty ( file, "query1" ) );
//        while (rs.next ( )) {
//            A.add ( String.valueOf ( rs.getInt ( 1 ) ) );
//            A.add ( rs.getString ( 2 ) );
//            A.add ( String.valueOf ( rs.getInt ( 4 ) ) );
//            A.add ( String.valueOf ( rs.getInt ( 5 ) ) );
//            A.add ( String.valueOf ( rs.getInt ( 6 ) ) );
//        }
//
//    }

}