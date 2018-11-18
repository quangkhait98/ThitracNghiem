package function;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import connect.MySQLConnUtils;
import model.cauhoi;

public class cauhoif {

	/*public java.util.List<cauhoi> getquestionsFromExcel(InputStream inp) 
	{
	
		try(Workbook workbook = new XSSFWorkbook();)
		{
			java.util.List<cauhoi> cauhoi = new ArrayList<>();
			Iterator<Sheet> shIterator = workbook.sheetIterator();
			DataFormatter fmt = new DataFormatter();
			while (shIterator.hasNext())
			{
				Iterator<Row> iterator = shIterator.next().iterator();
				while (iterator.hasNext())
				{
					Row currentRow = iterator.next();					
					cauhoi ch = new cauhoi();
					ch.setNoidung(currentRow.getCell(1).getStringCellValue());
					ch.setLoaicauhoi(currentRow.getCell(2).getStringCellValue());
					ch.setDapan1(currentRow.getCell(3).getStringCellValue());
					ch.setDapan2(currentRow.getCell(4).getStringCellValue());
					ch.setDapan3(currentRow.getCell(5).getStringCellValue());
					ch.setDapan4(currentRow.getCell(6).getStringCellValue());
					ch.setDapandung(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(6))));
					cauhoi.add(ch);
				}
				return cauhoi;
			}
		}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}	
	
		return null;
	}
*/

	public boolean addquestionfromexcel(java.util.List<cauhoi> CauHoi, String chonmon, String chonloai)
			throws SQLException {
		try(Connection connnection = MySQLConnUtils.getMySQLConnection();){
		String sql = "INSERT INTO cauhoi (NoiDung,LoaiCauHoi,DapAn1,DapAn2,DapAn3,DapAn4,MaMon,DapAnDung) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connnection.prepareStatement(sql);
			for(cauhoi ch : CauHoi)
			{
				ps.setString(1, ch.getNoidung());
				ps.setString(2,ch.getDapan1());
				ps.setString(3,ch.getDapan2());
				ps.setString(4,ch.getDapan3());
				ps.setString(5,ch.getDapan4());
				ps.setString(6,chonmon);
				ps.setString(7,chonloai);
				ps.setInt(8, ch.getDapandung());
				ps.addBatch();
			}
			int[] results = ps.executeBatch();
			for (int result : results) {
				if (result < 1) {
					connnection.rollback();
					return false;
				}
			}
			connnection.commit();
			return true;
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public int themcauhoi(cauhoi cauhoi) {
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		try
		{
			String sql = "INSERT INTO cauhoi (NoiDung,LoaiCauHoi,DapAn1,DapAn2,DapAn3,DapAn4,MaMon,DapAnDung) VALUES (?,?,?,?,?,?,?,?)";
				PreparedStatement ps = connnection.prepareStatement(sql);
				ps.setString(1,cauhoi.getNoidung() );
				ps.setString(2, cauhoi.getLoaicauhoi());
				ps.setString(3, cauhoi.getDapan1());
				ps.setString(4, cauhoi.getDapan2());
				ps.setString(5, cauhoi.getDapan3());
				ps.setString(6,	cauhoi.getDapan4());
				ps.setString(7, cauhoi.getMamon());
				ps.setInt(8, cauhoi.getDapandung());
			int dem= ps.executeUpdate();
			return dem;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

