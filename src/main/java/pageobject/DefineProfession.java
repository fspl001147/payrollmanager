package pageobject;

import frameworksupportmethods.GenericBaseClass;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefineProfession extends GenericBaseClass {
    private File file = new File ( "configuration\\pageproperties\\DefineProfession.properties" );

    public void openDefineProfessionFrame ( ) {
        try {
            openPayrollWebpage.Define_Profession ( );
            event.switchToFrame ( readFile.getElement ( file, "frame" ) );

        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
            e.printStackTrace ( );
        }
    }

    public WebElement locateProfessionTextBox ( ) throws IOException {
        return readFile.getElement ( file, "professiontextbox" );
    }

    public WebElement locateSaveButton ( ) throws IOException {
        return readFile.getElement ( file, "savebutton" );
    }

    public WebElement locatePrintButton ( ) throws IOException {
        return readFile.getElement ( file, "printbutton" );
    }

    public WebElement locateCancelButton ( ) throws IOException {
        return readFile.getElement ( file, "cancelbutton" );
    }

    public WebElement locateViewButton ( ) throws IOException {
        return readFile.getElement ( file, "viewbutton" );

    }

    public WebElement locateDeleteButton ( ) throws IOException {
        return readFile.getElement ( file, "deletebutton" );
    }

    public WebElement locateModifyButton ( ) throws IOException {
        return readFile.getElement ( file, "modifybutton" );
    }

    public List <WebElement > locateSelectButton ( ) throws IOException {
         return readFile.getElements ( file, "selectbutton" );
    }

    public WebElement getSavedProfessionValue (int i) throws IOException {
        return locateSelectButton ().get ( i-1 );
    }
}