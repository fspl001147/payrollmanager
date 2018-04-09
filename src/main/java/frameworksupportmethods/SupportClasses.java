package frameworksupportmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static webdriver.AppDriver.getCurrentDriver;

public class SupportClasses {

    public String[] checkValidityInTextBox (File file, String elementfortextbox, String expectedmessage, String elementformessagebox, String enteredvalue) throws IOException, InterruptedException {
        WebElement e1 = new ReadFile ( ).getElement ( file, elementformessagebox );
        String acceptedvalueattextbox = new ReadFile ( ).getElement ( file, elementfortextbox ).getAttribute ( "value" );
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
