package frameworksupportmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static webdriver.AppDriver.getCurrentDriver;

public class SupportClasses extends GenericBaseClass {

    public String[] checkValidityInTextBox (File file, WebElement elementfortextbox, String expectedmessage, WebElement elementformessagebox, String textboxname, String enteredvalue) throws Exception {
        /*Parameter 1 : file address
        * Parameter 2 : return the textbox webelement over which we are working
        * Parameter 3 : use read property method and return the expected message over textbox corresponding to the key value supplied
        * Parameter 4 : corresponding to textbox message box element will be supplied
        * Parameter 5 : Label name of the textbpx working for printing of messages
        * Parameter 6 : value for which acceptability has to be checked.. */
        WebElement e1 = elementformessagebox;
        String acceptedvalueattextbox = elementfortextbox.getAttribute ( "value" );

        String message1 = new ReadFile ( ).readProperty ( file, expectedmessage );
        String A[] = new String[3];
        String status;
        String message;
        String displayed_message;
        if ( acceptedvalueattextbox == null ) {
            message = enteredvalue + " is not acceptable in " + textboxname + " textbox";
            status = "value supplied is not allowed";
            if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                displayed_message = e1.getAttribute ( "innerHTML" );
            } else {
                displayed_message = "NaN";
            }
        } else {
            if ( acceptedvalueattextbox.equals ( enteredvalue ) ) {
                if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                    displayed_message = e1.getAttribute ( "innerHTML" );
                    if ( message1.equals ( displayed_message ) ) {
                        message = enteredvalue + " is not acceptable in " + textboxname + " textbox";
                        status = "value supplied is not accpeted";
                    } else {
                        message = "Something went wrong Message Displayed is : " + displayed_message;
                        status = "please check validation message displayed some other criteria is breached";
                    }
                } else {
                    message = enteredvalue + " is accepted in " + textboxname + " textbox";
                    status = "value supplied is accepted";
                    displayed_message = "NaN";
                }
            } else {
                message = "Something went wrong Entered value is " + enteredvalue + " & accepted value is " + acceptedvalueattextbox;
                status = "value supplied is trimmed";
                if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                    displayed_message = e1.getAttribute ( "innerHTML" );
                } else {
                    displayed_message = "NaN";
                }
            }
        }
        System.out.println ( message );
        A[0] = status;
        A[1] = message;
        A[2] = displayed_message;
        return A;
    }

    public String[] checkLengthOfTextBox (File file, WebElement elementfortextbox, String expectedmessage, WebElement elementformessagebox, String textboxname, String enteredvalue, int maxallowedlength) throws Exception {
        String A[] = new String[3];
        String status;
        String message;
        String displayed_message;
        String acceptedvalueattextbox = elementfortextbox.getAttribute ( "value" );
        WebElement e1 = elementformessagebox;
        String message1 = new ReadFile ( ).readProperty ( file, expectedmessage );

        if ( acceptedvalueattextbox == null ) {
            message = "entered value is not acceptable please check accpetability criteria...";
            status = "value supplied is not allowed";
            if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                displayed_message = e1.getAttribute ( "innerHTML" );
            } else {
                displayed_message = "NaN";
            }
        } else {
            if ( enteredvalue.equals ( acceptedvalueattextbox ) ) {
                if ( enteredvalue.length ( ) > maxallowedlength ) {
                    if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                        displayed_message = e1.getAttribute ( "innerHTML" );
                        status = "Entered value is not allowed";
                        message = "At " + textboxname + " maximum allowed length is " + maxallowedlength;
                    } else {
                        status = "Something went wrong";
                        message = "Acceptability criteria changed as maximum allowed length at " + textboxname + " is " + maxallowedlength + " but it is accepting " + enteredvalue.length ( );
                        displayed_message = "NaN";
                    }
                } else {
                    if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                        displayed_message = e1.getAttribute ( "innerHTML" );
                        status = "Something went wrong";
                        message = "At " + textboxname + " maximum allowed length is " + maxallowedlength;
                    } else {
                        status = "Entered value is allowed";
                        message = maxallowedlength + " is the maxmimum limit of " + textboxname;
                        displayed_message = "NaN";
                    }
                }
            } else {
                message = "Entered value is trimmed";
                if ( acceptedvalueattextbox.length ( ) > maxallowedlength ) {
                    if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                        displayed_message = e1.getAttribute ( "innerHTML" );
                        status = "Something went wrong";

                    } else {
                        status = "length criteria is changed";
                        displayed_message = "NaN";
                    }
                } else {
                    message = message + " and acceptability criteria is changed";
                    if ( e1.getAttribute ( "style" ).contains ( "inline" ) ) {
                        displayed_message = e1.getAttribute ( "innerHTML" );
                        status = "Something went wrong";
                    } else {
                        status = "Something went wrong";
                        displayed_message = "NaN";
                    }
                }
            }
        }
        System.out.println ( message );
        A[0] = status;
        A[1] = message;
        A[2] = displayed_message;
        return A;
    }
}
