package utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static webdriver.AppDriver.driver;
import static webdriver.AppDriver.getCurrentDriver;

public class EventHandlingUtility {
    public void switchToFrame (WebElement frame, int time) throws IOException {
        WebDriverWait wait = new WebDriverWait ( driver, time );
        wait.until ( ExpectedConditions.visibilityOf ( frame ) );
        getCurrentDriver ( ).switchTo ( ).frame ( frame );
    }

    public void enterText (WebElement textfield, String text, int time) {
        try {
            WebDriverWait wait = new WebDriverWait ( driver, time );
            wait.until ( ExpectedConditions.visibilityOf ( textfield ) );
            textfield.sendKeys ( text );
        } catch (NoSuchElementException e) {
            System.out.println ( e.getMessage ( ) );
        }
    }

    public void clearText (WebElement textfield) {
        textfield.clear ( );
    }

    public void click (WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait ( driver, time );
        wait.until ( ExpectedConditions.visibilityOf ( element ) );
        element.click ( );

    }
}
