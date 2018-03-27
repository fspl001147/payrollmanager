package webdriver;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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

    public void switchToParentWindow ( ) throws IOException {
        getCurrentDriver ( ).switchTo ( ).defaultContent ( );
    }

    public void switchToWindow (int winindex) throws IOException {
        ArrayList <String> windows = new ArrayList <String> ( getCurrentDriver ( ).getWindowHandles ( ) );
        getCurrentDriver ( ).switchTo ( ).window ( windows.get ( winindex ) );
    }
}
