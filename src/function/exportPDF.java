package function;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class exportPDF {
	private static String FILE = "C:/Users/doinh/Desktop/ketquathi.pdf";
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);

	public static void main(String[] args) {
		try {
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
			PdfPTable table = new PdfPTable(2);
			table.setTotalWidth(500);
			table.setLockedWidth(true);
			table.setWidths(new float[] { 4, 6 });
			document.open();

			Image image1 = Image.getInstance("C:/Users/doinh/Desktop/background222.jpg");
			image1.scaleAbsolute(540, 370);			
			document.add(image1);
			
			PdfContentByte canvas = writer.getDirectContent();
			PdfPCell c1 = new PdfPCell(new Phrase("Thí sinh", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			c1.setFixedHeight(35f);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Table Header 2", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Bài thi", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			c1.setFixedHeight(35f);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Table Header 2", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Thời gian bắt đầu", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			c1.setFixedHeight(35f);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Table Header 2", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Thời gian nộp bài", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			c1.setFixedHeight(35f);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Table Header 2", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Điểm", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			c1.setFixedHeight(35f);
			table.addCell(c1);
			
			c1 = new PdfPCell(new Phrase("Table Header 2", catFont));
			c1.setHorizontalAlignment(Element.ALIGN_LEFT);
			c1.setBorder(Rectangle.NO_BORDER);
			table.addCell(c1);
			
			table.writeSelectedRows(0, -1, 100, 690, canvas);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}