

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Service
 */
public class Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Service() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

        		response.getWriter().println(test + "---" + foobar);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
