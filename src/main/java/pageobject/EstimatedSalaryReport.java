package pageobject;

import frameworksupportmethods.GenericBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static webdriver.AppDriver.driver;

public class EstimatedSalaryReport extends GenericBaseClass {

 private File file = new File ( "configuration\\pageproperties\\EstimatedSalaryReport.properties" ) ;

    public void openEstimatedSalaryReportFrame() {
        try {
            openPayrollWebpage.Estimated_Salary_Report ();
            event.switchToFrame ( readFile.getElement ( file, "frame" ) );

        } catch (IOException e) {
            System.out.println ( e.getMessage () );
            e.printStackTrace ( );
        }
    }

}
