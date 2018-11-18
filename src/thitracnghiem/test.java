package thitracnghiem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import connect.MySQLConnUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public test() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		Connection cnn = MySQLConnUtils.getMySQLConnection();
		try
		{
			Statement state = cnn.createStatement();
			String sql = "SELECT * FROM lop";
			ResultSet res = state.executeQuery(sql);
			while (res.next())
			{
				String malop = res.getString(1);
				String tenlop = res.getString(2);
				System.out.println("malop:" + malop);
		        System.out.println("tenlop:" + tenlop);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
