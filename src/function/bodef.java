package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import model.bode;
import model.pagehome;
import model.lophoc;
import connect.MySQLConnUtils;

public class bodef {
	public void TaoBoDe(bode bode) {
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try {
			String sql = "INSERT INTO bode (MaBoDe, TenBoDe, SLKho, SLTBinh, SLDe, MaMon) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps = connnection.prepareStatement(sql);
			ps.setString(1, bode.getMaBode());
			ps.setString(2, bode.getTenBoDe());
			ps.setInt(3, bode.getSlKho());
			ps.setInt(4, bode.getSlTB());
			ps.setInt(5, bode.getSlDe());
			ps.setString(6, bode.getMaMon());
			ps.execute();
			String sql2 = "INSERT INTO bode_lop (MaLop, MaBoDe, SoLanNopToiDa, ThoiGianBatDau, ThoiGianKetThuc, ThoiGianLamBai) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps2 = connnection.prepareStatement(sql2);
			ps2.setString(1, bode.getMaLop());
			ps2.setString(2, bode.getMaBode());
			ps2.setInt(3, bode.getSoLanNopToiDa());
			ps2.setDate(4, bode.getThoiGianBatDau());
			ps2.setDate(5, bode.getThoiGianKetThuc());
			ps2.setTime(6, bode.getThoiGianLamBai());
			ps2.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<pagehome> loadhomepage (List<lophoc> classofstd)
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		List<pagehome> ph = new ArrayList<pagehome>();
		try {
			for (lophoc lophoc : classofstd) {
				String sql="select lop.malop,lop.tenlop,bode.mabode,bode.tenbode,thoigianbatdau,thoigianketthuc,thoigianlambai from lop inner join bode_lop on lop.malop = bode_lop.malop inner join bode on bode_lop.mabode=bode.mabode where lop.malop=?";
				PreparedStatement  ps = connnection.prepareStatement(sql);
				ps.setString(1, lophoc.getMalop());
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					pagehome pagehome = new pagehome();
					pagehome.setMalop(rs.getString("malop"));
					pagehome.setTenlop(rs.getString("tenlop"));
					pagehome.setMabode(rs.getString("mabode"));
					pagehome.setTenbode(rs.getString("tenbode"));
					pagehome.setThoigianbatdau(rs.getTimestamp("thoigianbatdau"));
					pagehome.setThoigianketthuc(rs.getTimestamp("thoigianketthuc"));
					pagehome.setThoigianlambai(rs.getTime("thoigianlambai"));
					ph.add(pagehome);
				}
			}
			return ph;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public pagehome getdetails (String mabd)
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try {
		String	sql="select lop.malop,lop.tenlop,bode.mabode,bode.tenbode,thoigianbatdau,thoigianketthuc,thoigianlambai from lop inner join bode_lop on lop.malop = bode_lop.malop inner join bode on bode_lop.mabode=bode.mabode where bode.mabode=?";
		PreparedStatement  ps = connnection.prepareStatement(sql);
		ps.setString(1, mabd);
		ResultSet rs = ps.executeQuery();
		pagehome ph = new pagehome();
		while(rs.next())
		{
			ph.setMalop(rs.getString("malop"));
			ph.setMabode(rs.getString("mabode"));
			ph.setTenlop(rs.getString("tenlop"));
			ph.setTenbode(rs.getString("tenbode"));
			ph.setThoigianbatdau(rs.getTimestamp("thoigianbatdau"));
			ph.setThoigianketthuc(rs.getTimestamp("thoigianketthuc"));
			ph.setThoigianlambai(rs.getTime("thoigianlambai"));
		}
		return ph;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
