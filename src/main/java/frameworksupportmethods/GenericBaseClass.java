package frameworksupportmethods;

import cucumber.api.Scenario;

import java.io.File;
import java.util.Collection;

public abstract class GenericBaseClass {
    protected File fileConfig = new File ( "configuration\\GenericConfig.properties" );
    protected File mainMenuPath = new File ( "configuration\\MainMenu.properties" );
    protected File modulePath = new File ( "configuration\\Module.properties" );
    protected File payroll_WebpageMenuPath = new File ( "configuration\\Payroll_Webpage.properties" );
    public static Scenario scenario;
}
