package function;
import connect.MySQLConnUtils;
import model.nguoidung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class nguoidungf {

	
	public boolean kiemTraDangNhap(String manguoidung, String matkhau) {
		Connection connection = MySQLConnUtils.getMySQLConnection();
	   
	    try {
	   	 Statement state = connection.createStatement();
	   	 String sql = "select * from nguoidung where MaNguoiDung='" + manguoidung + "'and MatKhau='" + matkhau + "'";
	        ResultSet rs = state.executeQuery(sql);
	        while (rs.next()) {
	            return true;
	        }
	    } catch (SQLException ex) {
	       ex.getStackTrace();
	    }
		return false;
	}


	public nguoidung getTaiKhoan(String manguoidung) {
		Connection connection = MySQLConnUtils.getMySQLConnection();
       
        try {
        	Statement state = connection.createStatement();
        	 String sql = "select * from nguoidung where MaNguoiDung='" + manguoidung + "'";
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
            	nguoidung nd = new nguoidung();
                nd.setManguoidung(rs.getString("MaNguoiDung"));
                nd.setQuyen(rs.getString("Quyen"));
                nd.setTenNguoiDung(rs.getString("tenNguoiDung"));
                return nd;
            }
        } catch (SQLException ex) {
        	 ex.getStackTrace();
        }
		return null;
	}	
	public List<nguoidung> getstudent(String idclass)
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try {
			String sql = "select nguoidung.MaNguoiDung,TenNguoiDung from hoc,nguoidung where hoc.MaNguoiDung=nguoidung.MaNguoiDung and hoc.MaLop = ?";
			PreparedStatement  ps = connnection.prepareStatement(sql);
			ps.setString(1, idclass);
			ResultSet rs = ps.executeQuery();
			java.util.List<nguoidung> lch = new ArrayList<nguoidung>();
			while(rs.next())
			{
				nguoidung stdc = new nguoidung();
				stdc.setManguoidung(rs.getString("MaNguoidung"));
				stdc.setTennguoidung(rs.getString("TenNguoidung"));
				lch.add(stdc);
			}
			return lch;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;	
	}
	public List<nguoidung> svkothuoclop(String idclass)
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try {
		String sql="select nguoidung.MaNguoiDung,nguoidung.TenNguoiDung from hoc,nguoidung where hoc.MaNguoiDung=nguoidung.MaNguoiDung and hoc.MaLop != ?";
		PreparedStatement  ps = connnection.prepareStatement(sql);
		ps.setString(1, idclass);
		ResultSet rs = ps.executeQuery();
		java.util.List<nguoidung> lch = new ArrayList<nguoidung>();
		while(rs.next())
		{
			nguoidung stdc = new nguoidung();
			stdc.setManguoidung(rs.getString("Manguoidung"));
			stdc.setTennguoidung(rs.getString("TenNguoidung"));
			lch.add(stdc);
		}
		return lch;
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return null;
	}
	public int deletestudentofclass(String idstd,String idclass)
	{
		try {
			Connection connnection = MySQLConnUtils.getMySQLConnection();
			String sql = "delete from hoc where hoc.MaLop = ? and hoc.MaNguoiDung = ?";
			PreparedStatement  ps = connnection.prepareStatement(sql);
			ps.setString(1, idclass);
			ps.setString(2, idstd);
			int dem = ps.executeUpdate();
			return dem;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int addstdofclass(String studentid,String classid)
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try {
			String sql = "INSERT INTO hoc (MaLop,MaNguoiDung) VALUES (?,?)";
			PreparedStatement ps = connnection.prepareStatement(sql);
			ps.setString(1, classid);
			ps.setString(2, studentid);
			int dem= ps.executeUpdate();
			return dem;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
