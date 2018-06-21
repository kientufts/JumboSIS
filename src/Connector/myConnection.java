package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kienle
 */
public class myConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/JumboSIS", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
