/**
 * Created by rusk on 4/8/16.
 */
import java.sql.*;
import java.util.*;
public class CreateTable {

    public static void main(String[] args) {
        Connection con = null;
        try {
            String userName = "root";
            String password = "kunal047";
            String url = "jdbc:mysql://localhost/hoteldb";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
            System.out.println("Connection Successful");
            stmt.executeUpdate("drop table if exists books");
            stmt.executeUpdate("create table books ("
                    + "isbn char(10), title char(50),"
                    + "author char(50), publisher char(50))");
            System.out.println("Created books table sucessfully");
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
