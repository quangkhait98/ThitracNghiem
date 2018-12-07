package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.MySQLConnUtils;
import model.ketquathi;

public class ketquathif {
	public List<ketquathi> getketqua(String manguoidung)
	{
		Connection connection = MySQLConnUtils.getMySQLConnection();
		try {
			String sql = "select lop.tenlop,bode.tenbode,diem,thoigiannop from ketquathi inner join bode on ketquathi.mabode=bode.mabode inner join bode_lop on bode.mabode=bode_lop.mabode inner join lop on lop.malop=bode_lop.malop where manguoidung=? order by thoigiannop desc;";
			PreparedStatement  ps = connection.prepareStatement(sql);
			ps.setString(1, manguoidung);
			ResultSet rs = ps.executeQuery();
			List<ketquathi> kqthi = new  ArrayList<ketquathi>();
			while(rs.next())
			{
				ketquathi ketquathi = new ketquathi();
				ketquathi.setDiem(rs.getInt("diem"));
				ketquathi.setThoigiannopbai(rs.getTimestamp("thoigiannop"));
				ketquathi.setTenlop(rs.getString("tenlop"));
				ketquathi.setTenbode(rs.getString("tenbode"));
				kqthi.add(ketquathi);
			}
			return kqthi;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
