package frameworksupportmethods;

import java.io.File;

public abstract class GenericBaseClass {

    // protected static Collection<String> scenario = null;
    // protected ReadFile readFile = new ReadFile ( );
    //  protected OpenMasterWebPage oldOpenMasterWebPage = new OpenMasterWebPage ( );
    //  protected EventHandlingUtility event = new EventHandlingUtility ();
    //   protected DriverMethods dm = new DriverMethods ( );
//    protected OpenPayrollWebpage openPayrollWebpage = new OpenPayrollWebpage();

    protected File fileConfig = new File ( "configuration\\GenericConfig.properties" );
    protected File mainMenuPath = new File ( "configuration\\MainMenu.properties" );
    protected File modulePath = new File ( "configuration\\Module.properties" );

    protected File payroll_WebpageMenuPath = new File ( "configuration\\Payroll_Webpage.properties" );
    protected File attendance_WebpageMenuPath = new File ( "configuration\\Attendance_Webpage.properties" );
}
