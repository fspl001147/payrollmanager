package frameworksupportmethods;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static webdriver.AppDriver.getCurrentDriver;

public class SupportClasses extends GenericBaseClass {
    public static Logger log = Logger.getLogger ( SupportClasses.class.getName ( ) );

    /* public Logger getLogFiles() {
         PropertyConfigurator.configure ( "Log4j.properties" );
         Logger logger = Logger.getLogger ( SupportClasses.get );
         //  Properties log4jProp = new Properties();
         // log4jProp.setProperty("log4j.rootLogger", "WARN");
         //  System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
         // BasicConfigurator.configure();

         return logger;

     }*/
    static {
        init ( );
    }

    public static void init ( ) {
        PropertyConfigurator.configure ( "Log4j.properties" );

    }

    public String[] checkValidityInTextBox (File file, String elementfortextbox, String expectedmessage, String elementformessagebox, String enteredvalue) throws Exception {
        WebElement e1 = new ReadFile ( ).getElement ( file, elementformessagebox, 5 );
        String acceptedvalueattextbox = new ReadFile ( ).getElement ( file, elementfortextbox, 5 ).getAttribute ( "value" );
        String message1 = new ReadFile ( ).readProperty ( file, expectedmessage );

        String textboxname = getCurrentDriver ( ).findElement ( By.xpath ( new ReadFile ( ).readProperty ( file, elementfortextbox ) + "/preceding-sibling::span" ) ).getAttribute ( "innerHTML" );
        String A[] = new String[2];
        String status;
        String message;
        if ( acceptedvalueattextbox == null ) {
            message = enteredvalue + " is not acceptable in " + textboxname + " textbox";
            status = "true";
        } else {
            if ( acceptedvalueattextbox.equals ( enteredvalue ) ) {
                System.out.println ( e1.getAttribute ( "style" ) );
                if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                    String message2 = e1.getAttribute ( "innerHTML" );
                    if ( message1.equals ( message2 ) ) {
                        message = enteredvalue + " is not acceptable in " + textboxname + " textbox";
                        status = "true";
                    } else {

                        message = "Something went wrong Message Displayed is : " + message2;
                        status = "true";
                    }
                } else {
                    message = enteredvalue + " is accepted in " + textboxname + " textbox";
                    status = "false";
                }
            } else {
                message = "Something went wrong Entered value is " + enteredvalue + " & accepted value is " + acceptedvalueattextbox;
                status = "true";
            }
        }
        System.out.println ( message );
        A[0] = status;
        A[1] = message;
        return A;
    }
}
