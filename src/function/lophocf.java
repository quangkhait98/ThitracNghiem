package function;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connect.MySQLConnUtils;
import model.lophoc;

public class lophocf {
	public ArrayList<lophoc> getclass ()
	{
		Connection connection = MySQLConnUtils.getMySQLConnection();    
		try {
			Statement state = connection.createStatement();
        	String sql = "select * from thitracnghiem.lop ";
            ResultSet rs = state.executeQuery(sql);
            ArrayList<lophoc> lh = new ArrayList<>();
            while(rs.next())
            {
            	lophoc lophoc = new lophoc();
            	lophoc.setMalop(rs.getString("MaLop"));
            	lophoc.setTenlop(rs.getString("TenLop"));
            	lh.add(lophoc);
            }
            return lh;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
