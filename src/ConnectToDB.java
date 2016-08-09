/**
 * Created by rusk on 4/8/16.
 */
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class ConnectToDB {

    public static void main(String[] args) {
        Connection con = null;
        try {
            String userName = "root";
            String password = "kunal047";
            String url = "jdbc:mysql://localhost/hoteldb";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Successful");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null){
                try {
                    con.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println(con);
            }
        }
    }
}
