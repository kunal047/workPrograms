import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

/**
 * Created by rusk on 5/8/16.
 */

public class Prepared {
    public static void main(String[] args) {
        Connection con = null;
        BufferedReader input = null;
        try {
            String userName = "root";
            String password = "kunal047";
            String url = "jdbc:mysql://localhost/hoteldb";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Successful");
            Statement stmt = con.createStatement();
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the record to update ");
            String isbn = input.readLine();
            System.out.println("Enter data ");
            String data = input.readLine();
            PreparedStatement ptst;
            String ps = "update books set title = ? where isbn = ?";
            ptst = con.prepareStatement(ps);
            ptst.setString(1, data);
            ptst.setString(2, isbn);
            ptst.executeUpdate();
            con.close();
            System.out.println("Record Updated");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(con);
            }
        }
    }
}
