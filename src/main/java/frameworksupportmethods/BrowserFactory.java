package frameworksupportmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

import static webdriver.AppDriver.driver;

public class BrowserFactory extends GenericBaseClass {
    public WebDriver launchbrowser (String browser) throws IOException {

        switch (browser) {
            case "chrome":
                System.setProperty ( new ReadFile ( ).readProperty ( fileConfig, "chromedriver" ), new ReadFile ( ).readProperty ( fileConfig, "chromedriverpath" ) );
                driver = new ChromeDriver ( );
                break;

            case "firefox":
                System.setProperty ( new ReadFile ( ).readProperty ( fileConfig, "firefoxdriver" ), new ReadFile ( ).readProperty ( fileConfig, "firefoxdriverpath" ) );
                driver = new FirefoxDriver ( );
                break;

            case "ie":
                System.setProperty ( new ReadFile ( ).readProperty ( fileConfig, "iedriver" ), new ReadFile ( ).readProperty ( fileConfig, "iedriverpath" ) );
                driver = new InternetExplorerDriver ( );
                break;
        }
        return driver;
    }
}