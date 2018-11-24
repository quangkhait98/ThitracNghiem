package function;
import connect.MySQLConnUtils;
import model.nguoidung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
}
