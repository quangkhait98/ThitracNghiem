package controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.bodef;
import function.cauhoif;
import function.monhocf;
import model.bode;
import model.cauhoi;
import model.monhoc;

@WebServlet("/QuanLyBoDe")

public class QuanLyBoDe extends HttpServlet {
	bodef bdf = new bodef();
	private static final long serialVersionUID = 1L;

	public QuanLyBoDe() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		monhocf mhf = new monhocf();
		ArrayList<monhoc> mh = mhf.getmonhoc();
		if(mh != null && mh.size()>0)
		{
			request.setAttribute("chonmon", mh);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		byte[] array = new byte[10]; // length is bounded by 7
		new Random().nextBytes(array);
		String maBoDe = new String(array, Charset.forName("UTF-8"));
		String tenBoDe = "bode" + maBoDe;
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		java.sql.Time thoiGianLamBai = null;
		java.sql.Date ngayMoDe = null;
		java.sql.Date ngayDongDe = null;
		int slDe = 0, slTBinh = 0, slKho = 0;
		String gioLamBai = request.getParameter("giolambai");
		String phutLamBai = request.getParameter("phutlambai");
		int soLanLamBai = Integer.parseInt(request.getParameter("solanlambai"));
		try {
			ngayMoDe = new java.sql.Date(formatter.parse(request.getParameter("ngaymode")).getTime());
			ngayDongDe = new java.sql.Date(formatter.parse(request.getParameter("ngaydongde")).getTime());
			thoiGianLamBai = new java.sql.Time(Long.valueOf(new SimpleDateFormat("HH:mm").parse(gioLamBai + ":" + phutLamBai).getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String lopGiaoDe = request.getParameter("lopgiaode");
		String mon = request.getParameter("mon");
		String[] doKho = new String[3];
		int[] soluong = new int[3];
		for (int i = 0; i < 3; i++) {
			doKho[i] = "a";
			soluong[i] = 0;
			try {
				doKho[i] = request.getParameter("dokho-" + i);
				soluong[i] = Integer.parseInt(request.getParameter("soluong-" + i));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		String err = "";
		if (ngayMoDe == null) {
			err = "Chưa chọn ngày mở đề!";
		}
		if (ngayDongDe == null) {
			err = "Chưa chọn ngày đóng đề!";
		}
		for (int i = 0; i < 3; i++) {
			if (doKho[i] != null) {
				if (doKho[i].equals("Dễ"))
					slDe = soluong[i];
				else if (doKho[i].equals("Trung Bình"))
					slTBinh = soluong[i];
				else if (doKho[i].equals("Khó"))
					slKho = soluong[i];
			}
		}
		if (err.length() == 0) {
			bode bode = new bode(maBoDe, tenBoDe, slDe, slTBinh, slKho, mon, soLanLamBai, ngayMoDe, ngayDongDe,
					thoiGianLamBai, lopGiaoDe);
			bdf.TaoBoDe(bode);
		} else {
			request.setAttribute("err", err);
		}
		cauhoif chf = new cauhoif();
		ArrayList<cauhoi> ch = chf.getquestion(mon, slDe, slTBinh, slKho);
		if(ch != null && ch.size()>0)
		{
			request.setAttribute("question", ch);
		}
		request.getRequestDispatcher("exampreview.jsp").forward(request, response);
	}

}
