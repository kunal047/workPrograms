/**
 * Created by rusk on 4/8/16.
 */
import java.sql.*;
import java.util.*;
public class SimpleQuery{

    public static void main(String[] args) {
        Connection con = null;
        try {
            String userName = "root";
            String password = "kunal047";
            String url = "jdbc:mysql://localhost/hoteldb";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Successful");
            Statement stmt;
            ResultSet rset;
            stmt = con.createStatement();
            rset = stmt.executeQuery("select * from orderdb");
            while (rset.next()){
                String itemName = rset.getString("itemName");
                int price = rset.getInt("itemPrice");
                int quantity = rset.getInt("itemQty");
                int total = rset.getInt("itemTotal");
                System.out.println("Item Name " + itemName);
                System.out.println("Price " + price);
                System.out.println("Quantity " + quantity);
                System.out.println("Total " + total);
            }
            rset.close();


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
