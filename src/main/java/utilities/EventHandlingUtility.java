package utilities;

import org.openqa.selenium.WebElement;

import java.io.IOException;

import static webdriver.AppDriver.getCurrentDriver;

public class EventHandlingUtility {


    public void switchToFrame (WebElement frame) throws IOException {
        getCurrentDriver ( ).switchTo ( ).frame ( frame );
    }

    public void enterText (WebElement textfield, String Text) {
        textfield.sendKeys ( Text );
    }

    public void clearText (WebElement textfield) {
        textfield.clear ( );
    }

    public void click (WebElement element) {
        element.click ( );
    }

}
