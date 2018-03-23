package frameworksupportmethods;

import org.openqa.selenium.WebElement;

import java.io.IOException;

public class UIMap extends GenericBaseClass {

    public WebElement getUsername ( ) throws IOException {
        return readFile.getElement ( fileConfig, "username" );
    }

    public WebElement getPassword ( ) throws IOException {
        return readFile.getElement ( fileConfig, "password" );
    }

    public WebElement getSignIn ( ) throws IOException {
        return readFile.getElement ( fileConfig, "signin" );
    }

    public WebElement getFeeManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "feesmanager" );
    }

    public WebElement getPayrollManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "payrollmanager" );
    }

    public WebElement getAttendanceManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "attendancemanager" );
    }

    public WebElement getStockManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "stockmanager" );
    }

    public WebElement getAdmissionManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "admissionmanager" );
    }

    public WebElement getAccountsManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "accountsmanager" );
    }

    public WebElement getUserManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "usermanager" );
    }

    public WebElement getTimeTableManagerLogo ( ) throws IOException {
        return readFile.getElement ( modulePath, "timetablemanager" );
    }
}