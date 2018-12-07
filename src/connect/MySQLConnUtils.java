package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	public static Connection getMySQLConnection() {
	    String userName = "root";
	    String password = "77181352";
	    String connectionURL = "jdbc:mysql://localhost:3306/thitracnghiem";
	    try
	    {
	    Class.forName("com.mysql.jdbc.Driver");
	    return DriverManager.getConnection(connectionURL,userName,password);
	    }
	    catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    catch (Exception e) 
	    {
			e.printStackTrace();
		}
	    return null;
	}	
}
