package frameworksupportmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static webdriver.AppDriver.getCurrentDriver;

public class ReadFile {
    private static Properties prop = new Properties ( );
    String values = "";

    private FileInputStream readFile (File file) throws FileNotFoundException {
        return new FileInputStream ( file );
    }

    public String readProperty (File file, String key) throws IOException {
        if ( file.exists ( ) ) {
            prop.load ( readFile ( file ) );
            values = prop.getProperty ( key );
        }
        return values;
    }

    public WebElement getElement (File file, String element) throws IOException {
        String value = readProperty ( file, element );
        String locator = readProperty ( file, element + "_type" );
        WebElement webelement = null;

        switch (locator) {
            case "id":
                webelement = getCurrentDriver ( ).findElement ( By.id ( value ) );
                break;
            case "name":
                webelement = getCurrentDriver ( ).findElement ( By.name ( value ) );
                break;
            case "xpath":
                webelement = getCurrentDriver ( ).findElement ( By.xpath ( value ) );
                break;
            case "linktext":
                webelement = getCurrentDriver ( ).findElement ( By.linkText ( value ) );
                break;
            case "tagname":
                webelement = getCurrentDriver ( ).findElement ( By.tagName ( value ) );
                break;
            case "cssselector":
                webelement = getCurrentDriver ( ).findElement ( By.cssSelector ( value ) );
                break;
            case "classname":
                webelement = getCurrentDriver ( ).findElement ( By.className ( value ) );
                break;
        }
        return webelement;
    }

    public List <WebElement> getElements (File file, String element) throws IOException {
        String value = readProperty ( file, element );
        String locator = readProperty ( file, element + "_type" );
        List <WebElement> webelement = null;

        switch (locator) {
            case "id":
                webelement = getCurrentDriver ( ).findElements ( By.id ( value ) );
                break;
            case "name":
                webelement = getCurrentDriver ( ).findElements ( By.name ( value ) );
                break;
            case "xpath":
                webelement = getCurrentDriver ( ).findElements ( By.xpath ( value ) );
                break;
            case "linktext":
                webelement = getCurrentDriver ( ).findElements ( By.linkText ( value ) );
                break;
            case "tagname":
                webelement = getCurrentDriver ( ).findElements ( By.tagName ( value ) );
                break;
            case "cssselector":
                webelement = getCurrentDriver ( ).findElements ( By.cssSelector ( value ) );
                break;
            case "classname":
                webelement = getCurrentDriver ( ).findElements ( By.className ( value ) );
                break;
        }

        return webelement;
    }

}