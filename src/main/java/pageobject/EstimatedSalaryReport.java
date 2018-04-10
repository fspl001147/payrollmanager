package pageobject;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;
import utilities.EventHandlingUtility;
import utilities.OpenPayrollWebpage;

import java.io.File;
import java.io.IOException;

public class EstimatedSalaryReport extends GenericBaseClass {

 private File file = new File ( "configuration\\pageproperties\\EstimatedSalaryReport.properties" ) ;

    public void openEstimatedSalaryReportFrame ( ) throws Exception {
        try {
            new OpenPayrollWebpage ( ).Estimated_Salary_Report ( );
            new EventHandlingUtility ( ).switchToFrame ( new ReadFile ( ).getElement ( file, "frame", 5 ), 10 );

        } catch (IOException e) {
            System.out.println ( e.getMessage () );
            e.printStackTrace ( );
        }
    }

}
