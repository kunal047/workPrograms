/**
 * Created by rusk on 4/8/16.
 */

import java.sql.*;
public class TestDriver {
    public static void main(String[] args) {
        try {
            Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Connection works !");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
