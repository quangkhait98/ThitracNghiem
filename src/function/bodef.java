package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.bode;

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
}
