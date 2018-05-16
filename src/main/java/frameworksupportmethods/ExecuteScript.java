package frameworksupportmethods;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DBConnectivity extends GenericBaseClass {
    private final String url = "jdbc:sqlserver://";
    private final String serverName = new ReadFile ( ).readProperty ( fileConfig, "serverName" );
    private final String portNumber = new ReadFile ( ).readProperty ( fileConfig, "portNumber" );
    private final String databaseName = new ReadFile ( ).readProperty ( fileConfig, "databaseName" );
    private final String userName = new ReadFile ( ).readProperty ( fileConfig, "sqlusername" );
    private final String password = new ReadFile ( ).readProperty ( fileConfig, "sqlpwd" );
    private Connection con = null;

    public DBConnectivity ( ) throws IOException {
        // constructor for class
    }

    private String getConnectionUrl ( ) {
        return url + serverName + ":" + portNumber + ";databaseName=" + databaseName;
    }

    public Connection getConnection ( ) {
        System.out.println ( "The desired URL is " + getConnectionUrl ( ) );
        try {
            Class.forName ( "com.microsoft.sqlserver.jdbc.SQLServerDriver" );
            System.out.println ( "The desired URL is " + getConnectionUrl ( ) );
            System.out.println ( "The desired username is " + userName );
            System.out.println ( "The desired password is " + password );

            con = java.sql.DriverManager.getConnection ( getConnectionUrl ( ), userName, password );
            if ( con != null ) {
                System.out.println ( "The desired connection string is " + con );
                System.out.println ( "connection established successfully" );
            } else {
                System.out.println ( "The desired connection string is null" + con + "..." );
            }
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace ( );
            System.out.println ( "Error Trace in getConnection() :" + e.getMessage ( ) );
        }
        return con;
    }
}

public class ExecuteScript extends DBConnectivity {
    public ExecuteScript ( ) throws IOException {
    }

    public ResultSet execScript (String query) throws SQLException {
        Connection con = getConnection ( );
        Statement sqlStatement = con.createStatement ( );
        String sqlQuery = query; //"Select * from GBL_mst_Staff order by SID;"
        ResultSet ResSet = sqlStatement.executeQuery ( sqlQuery );
        con.close ();
        return ResSet;
//        while (ResSet.next ( )) {
//            System.out.println ( ResSet.getNString ( "Address" ) + ResSet.getInt ( "Sid" ) );
//        }
    }
}
