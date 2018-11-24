package function;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.Part;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import connect.MySQLConnUtils;
import model.cauhoi;

public class cauhoif {

	public java.util.List<cauhoi> getquestionsFromExcel(InputStream inp) throws IOException {	
	try
	{
		
		Workbook workbook = new XSSFWorkbook(inp);
		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter fmt = new DataFormatter();
		Iterator<Row> iterator = sheet.iterator();
		Row firstRow = iterator.next();
		Cell mamon = firstRow.getCell(2);
		Cell loai = firstRow.getCell(3);
		java.util.List<cauhoi> cauhois = new  ArrayList<cauhoi>();
		while (iterator.hasNext()) {
			Row currentrow = iterator.next();
			cauhoi ch = new cauhoi();
			ch.setNoidung(currentrow.getCell(0).getStringCellValue());
			ch.setDapan1(currentrow.getCell(1).getStringCellValue());
			ch.setDapan2(currentrow.getCell(2).getStringCellValue());
			ch.setDapan3(currentrow.getCell(3).getStringCellValue());
			ch.setDapan4(currentrow.getCell(4).getStringCellValue());
			ch.setDapandung(Integer.parseInt(fmt.formatCellValue(currentrow.getCell(5))));
			ch.setMamon(mamon.getStringCellValue());
			ch.setLoaicauhoi(loai.getStringCellValue());
			cauhois.add(ch);
	}
		
		workbook.close();
		return cauhois;
	}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	return null;
	}


	
	
	public boolean addquestionfromexcel(java.util.List<cauhoi> CauHoi)
			throws SQLException {
		try(Connection connnection = MySQLConnUtils.getMySQLConnection();){
		String sql = "INSERT INTO cauhoi (NoiDung,LoaiCauHoi,DapAn1,DapAn2,DapAn3,DapAn4,MaMon,DapAnDung) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connnection.prepareStatement(sql);
			connnection.setAutoCommit(false);
			for(cauhoi ch : CauHoi)
			{
				ps.setString(1, ch.getNoidung());
				ps.setString(2,ch.getLoaicauhoi());
				ps.setString(3,ch.getDapan1());
				ps.setString(4,ch.getDapan2());
				ps.setString(5,ch.getDapan3());
				ps.setString(6,ch.getDapan4());
				ps.setString(7,ch.getMamon());
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
	public java.util.List<cauhoi> getquestion(String search,String monhoc,String loai,int length,int offset )
	{
		Connection connnection = MySQLConnUtils.getMySQLConnection();
		
		try {
			String sql = "SELECT * FROM cauhoi where MaMon=? and NoiDung like concat('%',?,'%') limit ?,?";
			PreparedStatement  ps = connnection.prepareStatement(sql);
				ps.setString(1, monhoc);
				ps.setString(2, search);
				ps.setInt(3,offset);
				ps.setInt(4, length);
				ResultSet rs = ps.executeQuery();
				java.util.List<cauhoi> lch = new ArrayList<cauhoi>();
				while(rs.next())
				{
					cauhoi ch= new cauhoi();
					ch.setMacauhoi(rs.getInt("MaCAuHoi"));
					ch.setNoidung(rs.getString("NoiDung"));
					ch.setLoaicauhoi(rs.getString("LoaiCauHoi"));
					ch.setDapan1(rs.getString("DapAn1"));
					ch.setDapan2(rs.getString("DapAn2"));
					ch.setDapan3(rs.getString("DapAn3"));
					ch.setDapan4(rs.getString("DapAn4"));
					ch.setDapandung(rs.getInt("DapAnDung"));
					ch.setMamon(rs.getString("MaMon"));
					lch.add(ch);
				}
				return lch;		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return null;		
	}
}

