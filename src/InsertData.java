/**
 * Created by rusk on 4/8/16.
 */
import java.sql.*;
import java.util.*;
public class InsertData {

    public static void main(String[] args) {
        Connection con = null;
        try {
            String userName = "root";
            String password = "kunal047";
            String url = "jdbc:mysql://localhost/hoteldb";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Successful");

            Statement stmt = con.createStatement();
            stmt.executeUpdate(
                    "insert into books(isbn, title, author, publisher)" +
                    "values('01674324','Java Complete reference','Herbert Schildt','Oracle Press')," +
                    "('5906554', 'Effective Java', 'Joshua', 'addison')");
            System.out.println("Record Added !");
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
