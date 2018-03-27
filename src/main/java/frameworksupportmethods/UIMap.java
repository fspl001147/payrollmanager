package frameworksupportmethods;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class UIMap extends GenericBaseClass {

    public WebElement getUsername ( ) throws IOException {

        return new ReadFile ( ).getElement ( fileConfig, "username" );
    }

    public WebElement getPassword ( ) throws IOException {
        return new ReadFile ( ).getElement ( fileConfig, "password" );
    }

    public WebElement getSignIn ( ) throws IOException {
        return new ReadFile ( ).getElement ( fileConfig, "signin" );
    }

    public WebElement getFeeManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardfeesmanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "feesmanager" );
        }
    }

    public WebElement getPayrollManagerLogo ( ) throws IOException {

        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardpayrollmanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "payrollmanager" );
        }
    }

    public WebElement getAttendanceManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardattendancemanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "attendancemanager" );

        }
    }

    public WebElement getStockManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardstockmanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "stockmanager" );

        }
    }

    public WebElement getAdmissionManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardadmissionmanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "admissionmanager" );

        }
    }

    public WebElement getAccountsManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardaccountsmanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "accountsmanager" );

        }
    }

    public WebElement getUserManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardusermanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "usermanager" );

        }
    }

    public WebElement getTimeTableManagerLogo ( ) throws IOException {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardtimetablemanager" );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "timetablemanager" );

        }
    }
}