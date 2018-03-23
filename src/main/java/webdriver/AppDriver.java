package webdriver;

import frameworksupportmethods.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public abstract class AppDriver {
    public static WebDriver driver ;
    private AppDriver ( ) {
        throw new IllegalStateException ( );
    }

    public static WebDriver getCurrentDriver ( ) throws IOException {
        BrowserFactory bfactory = new BrowserFactory ( );
        if ( driver == null )
            driver = bfactory.launchbrowser ( "chrome" );
        return driver;
    }
}
