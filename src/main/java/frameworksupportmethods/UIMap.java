package frameworksupportmethods;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class UIMap extends GenericBaseClass {

    public WebElement getUsername ( ) throws Exception {

        return new ReadFile ( ).getElement ( fileConfig, "username", 2 );
    }

    public WebElement getPassword ( ) throws Exception {
        return new ReadFile ( ).getElement ( fileConfig, "password", 2 );
    }

    public WebElement getSignIn ( ) throws Exception {
        return new ReadFile ( ).getElement ( fileConfig, "signin", 2 );
    }

    public WebElement getFeeManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardfeesmanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "feesmanager", 2 );
        }
    }

    public WebElement getPayrollManagerLogo ( ) throws Exception {

        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardpayrollmanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "payrollmanager", 2 );
        }
    }

    public WebElement getAttendanceManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardattendancemanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "attendancemanager", 2 );

        }
    }

    public WebElement getStockManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardstockmanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "stockmanager", 2 );

        }
    }

    public WebElement getAdmissionManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardadmissionmanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "admissionmanager", 2 );

        }
    }

    public WebElement getAccountsManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardaccountsmanager", 2 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "accountsmanager", 2 );

        }
    }

    public WebElement getUserManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardusermanager", 3 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "usermanager", 3 );

        }
    }

    public WebElement getTimeTableManagerLogo ( ) throws Exception {
        try {
            return new ReadFile ( ).getElement ( modulePath, "dashboardtimetablemanager", 3 );
        } catch (NoSuchElementException e) {
            return new ReadFile ( ).getElement ( modulePath, "timetablemanager", 3 );

        }
    }
}