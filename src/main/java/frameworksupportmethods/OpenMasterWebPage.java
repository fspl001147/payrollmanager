/*This function should be considered as a master source code to open each webpage in ERP
* It should take static value of Main menu Path (locators for global master, master setting and etc.)
* Webpage path should be the corresponding locators for webpage in ERP (the location should be module wise)
* Main Menu name should be the value of element in the MainMenu.properties file*/

package frameworksupportmethods;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.EventHandlingUtility;
import webdriver.AppDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static webdriver.AppDriver.driver;

public class OpenMasterWebPage extends GenericBaseClass {

    public void openWebPage (File WebPage_path, String mainmenu_name, String submenu_name, String webpage_name) throws IOException {

        /*Storing webpage and submenu value in a variable*/
        String sub_menu_name_value = new ReadFile ( ).readProperty ( WebPage_path, submenu_name );
        String web_page_name_value = new ReadFile ( ).readProperty ( WebPage_path, webpage_name );

        /*Open main menu*/
        new EventHandlingUtility ( ).click ( new ReadFile ( ).getElement ( mainMenuPath, mainmenu_name ), 20 );

        /*Storing names of all webpages in a web element list*/
        List <WebElement> master_dd = AppDriver.getCurrentDriver ( ).findElements ( By.xpath ( "//ul//li/a" ) );

        /*Opening desired main menu by comparing each value in the list*/
        for ( int i = 0; i < master_dd.size ( ); i++ ) {
            WebElement mainmenudd_item = master_dd.get ( i );
            String innerHTML = mainmenudd_item.getAttribute ( "innerHTML" );
            if ( innerHTML.contentEquals ( sub_menu_name_value ) ) {
                mainmenudd_item.click ( );
                break;
            }
        }

        /*Opening desired web page by comparing each value in the list*/
        List <WebElement> submenu_dd = AppDriver.getCurrentDriver ( ).findElements ( By.xpath ( "//ul//li/a" ) );
        for ( int i = 0; i < submenu_dd.size ( ); i++ ) {
            WebElement submenudd_item = submenu_dd.get ( i );
            String session_inner_HTML = submenudd_item.getAttribute ( "innerHTML" );
            if ( session_inner_HTML.contentEquals ( web_page_name_value ) ) {
                submenudd_item.click ( );
                break;
            }
        }
    }

    public void openWebPage (String mainmenu_name, File WebPage_path, String submenu_name, String webpage_name) throws IOException, InterruptedException {
        String sub_menu_name_value = new ReadFile ( ).readProperty ( WebPage_path, submenu_name );
        String web_page_name_value = new ReadFile ( ).readProperty ( WebPage_path, webpage_name );
        List <WebElement> submenu_dd = AppDriver.getCurrentDriver ( ).findElements ( By.xpath ( "//ul[@class ='sub-menu' ]//li/a" ) );
        new EventHandlingUtility ( ).click ( new ReadFile ( ).getElement ( mainMenuPath, mainmenu_name ), 20 );
        for ( WebElement element : submenu_dd ) {
            String pagevalue = element.getAttribute ( "innerHTML" );
            if ( pagevalue.contains ( "<p>" ) ) {
                Thread.sleep ( 1000 );
                if ( StringUtils.substringBetween ( pagevalue, "<p>", "</p>" ).contentEquals ( sub_menu_name_value ) ) {
                    element.click ( );
                } else {
                    if ( StringUtils.substringBetween ( pagevalue, "<p>", "</p>" ).contentEquals ( web_page_name_value ) ) {
                        element.click ( );
                        break;
                    }
                }
            } else {
                if ( pagevalue.contentEquals ( web_page_name_value ) ) {
                    element.click ( );
                    break;
                }
            }

        }
    }

    public void openWebPage (String mainmenu_name, String submenu_name, File WebPage_path, String webpage_name) throws Exception {

        String submenu_name_value = new ReadFile ( ).readProperty ( WebPage_path, submenu_name );
        String webpage_name_value = new ReadFile ( ).readProperty ( WebPage_path, webpage_name );

        // Click to Main Menu (Global Master)
        new EventHandlingUtility ( ).click ( new ReadFile ( ).getElement ( mainMenuPath, mainmenu_name ), 20 );

        // Click to Sub Menu (Define Session)
        String xpathforsession = "//ul//li/a/p[text()='" + submenu_name_value + "']";
        new EventHandlingUtility ( ).click ( driver.findElement ( By.xpath ( xpathforsession ) ), 20 );

        // Click to Web Page (Define Academic Year)
        String xpathfordesiredwebpage = "//ul//li/a/p[text()='" + webpage_name_value + "']";
        new EventHandlingUtility ( ).click ( driver.findElement ( By.xpath ( xpathfordesiredwebpage ) ), 20 );
    }

    public void openWebPage (File WebPage_path, String mainmenu_name, String webpage_name) throws Exception {

        String webpage_name_value = new ReadFile ( ).readProperty ( WebPage_path, webpage_name );
        // Click to Main Menu (Global Master)
        new EventHandlingUtility ( ).click ( new ReadFile ( ).getElement ( mainMenuPath, mainmenu_name ), 20 );
        // Click to Web Page (Define Staff Type)
        String xpathfordesiredwebpage = "//ul//li/a[text()='" + webpage_name_value + "']";
        new EventHandlingUtility ( ).click ( AppDriver.getCurrentDriver ( ).findElement ( By.xpath ( xpathfordesiredwebpage ) ), 20 );

    }

}

