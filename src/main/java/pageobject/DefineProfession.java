package pageobject;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;
import org.openqa.selenium.WebElement;
import utilities.EventHandlingUtility;
import utilities.OpenPayrollWebpage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefineProfession extends GenericBaseClass {
    private File file = new File ( "configuration\\pageproperties\\DefineProfession.properties" );

    public void openDefineProfessionFrame ( ) throws Exception {
        try {
            new OpenPayrollWebpage ( ).Define_Profession ( );
            new EventHandlingUtility ( ).switchToFrame ( new ReadFile ( ).getElement ( file, "frame", 3 ), 20 );

        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
    }

    public WebElement getProfessionTextBox ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "professiontextbox", 3 );
    }

    public WebElement getSaveButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "savebutton", 3 );
    }

    public WebElement getPrintButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "printbutton", 3 );
    }

    public WebElement getCancelButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "cancelbutton", 3 );
    }

    public WebElement getViewButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "viewbutton", 3 );

    }

    public WebElement getDeleteButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "deletebutton", 3 );
    }

    public WebElement getModifyButton ( ) throws Exception {
        return new ReadFile ( ).getElement ( file, "modifybutton", 3 );
    }

    public List <WebElement> getSelectButton ( ) throws IOException {
        return new ReadFile ( ).getElements ( file, "selectbutton", 3 );
    }

    public WebElement getSavedProfessionValue (int i) throws IOException {
        return getSelectButton ( ).get ( i - 1 );
    }
}