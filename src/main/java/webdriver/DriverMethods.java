package webdriver;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class DriverMethods extends GenericBaseClass {

    public void maximizeWindow ( ) throws IOException {
        getCurrentDriver ( ).manage ( ).window ( ).maximize ( );
    }

    public void getURL ( ) throws IOException {
        getCurrentDriver ( ).get ( new ReadFile ( ).readProperty ( fileConfig, "url" ) );
    }

    public void waitImplicitly (int time) throws IOException {
        getCurrentDriver ( ).manage ( ).timeouts ( ).implicitlyWait ( time, TimeUnit.SECONDS );
    }

//    public void waitExplicitly(WebElement element, int time) throws IOException{
//    WebDriverWait wait = new WebDriverWait ( driver, 5 );
//    wait.until ( ExpectedConditions.presenceOfAllElementsLocatedBy ( By. ));
//}
    public void switchToParentWindow ( ) throws IOException {
        getCurrentDriver ( ).switchTo ( ).defaultContent ( );
    }

    public void switchToWindow (String wintitle) throws IOException {
       Set <String> winhandles = getCurrentDriver ().getWindowHandles ();
        for ( String winhandle: winhandles ) {
          getCurrentDriver ().switchTo ().window ( winhandle );
          if ( getCurrentDriver ().getTitle ().equalsIgnoreCase ( wintitle ) ){
              break;
          }
        }
//        ArrayList <String> windows = new ArrayList <String> ( getCurrentDriver ( ).getWindowHandles ( ) );
//        for ( int i = 0; i <= 8; i++ ) {
//            if ( driver.getTitle ( ).equalsIgnoreCase ( wintitle ) ) {
//                getCurrentDriver ().switchTo ().window ( windows.get ( i ) );
//                break;
//            }
//        }
    }
}
