package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	public static Connection getMySQLConnection() {
	    String userName = "root";
<<<<<<< HEAD
	    String password = "rongdenmatdo";
	    
=======
	    String password = "quangkhamarsu";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
	    String connectionURL = "jdbc:mysql://localhost:3306/thitracnghiem?autoReconnect=true&useSSL=false";
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
