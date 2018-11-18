package function;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

	public void getquestionsFromExcel() throws IOException {	
	try
	{
		FileInputStream excelFile = new FileInputStream(new File("abc.xlsx"));
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter fmt = new DataFormatter();
		Iterator<Row> iterator = sheet.iterator();
		Row firstrow = iterator.next();
		Cell firstcell = firstrow.getCell(0);
		System.out.println(firstcell.getStringCellValue());
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
			cauhois.add(ch);
	}
		for(cauhoi cauhoi: cauhois)
		{
			System.out.println(cauhoi.getNoidung().toString()+" "+ cauhoi.getDapan1().toString()+" "+ cauhoi.getDapan2().toString()+" "+ cauhoi.getDapan3().toString()
			+" "+ cauhoi.getDapan4().toString()+" "+Integer.toString( cauhoi.getDapandung()).toString());
		}
		workbook.close();
	}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}


	
	
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

