package mysqlconnection;
 
import java.sql.*;
 
public class JDBCClient {
 
    public static void main(String args[]) {
        // database url
        String db_url = "jdbc:mysql://snack.fit.cvut.cz/mimdw";
 
        // username and password
        String username = "mimdw";
        String password = "mimdw";
 
        try {
            // Register JDBC driver (MySql driver)
            Class.forName("com.mysql.jdbc.Driver");
 
            // Open a connection
            Connection con = DriverManager.getConnection(db_url, username,
                    password);
 
            // Create and execute query statement
            Statement stmt = con.createStatement();
            String sql = "SELECT test, foobar FROM test";
            ResultSet rs = stmt.executeQuery(sql);
            // Loop and extract received data
            while (rs.next()) {
                String test = rs.getString("test");
                String foobar = rs.getString("foobar");
                System.out.println(test + "---" + foobar);
            }
 
            // Release the connections
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException se) {
 
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
 
            // Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}