package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;

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
		if (mh != null && mh.size() > 0) {
			request.setAttribute("mon", mh);
		}
		request.getRequestDispatcher("exammanage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		byte[] array = new byte[10];
		new Random().nextBytes(array);
		String maBoDe = new String(array, Charset.forName("UTF-8"));
		String tenBoDe = request.getParameter("tenbode");
		String url = "exammanage.jsp";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		java.sql.Time thoiGianLamBai = null;
		java.sql.Timestamp ngayMoDe = null;
		java.sql.Timestamp ngayDongDe = null;
		int slDe = 0, slTBinh = 0, slKho = 0;
		String gioLamBai = request.getParameter("giolambai");
		String phutLamBai = request.getParameter("phutlambai");
		int soLanLamBai = Integer.parseInt(request.getParameter("solanlambai"));
		try {
			thoiGianLamBai = new java.sql.Time(
				Long.valueOf(new SimpleDateFormat("HH:mm").parse(gioLamBai + ":" + phutLamBai).getTime()));
			ngayDongDe = new java.sql.Timestamp(formatter.parse(request.getParameter("ngaydongde")).getTime());
			ngayMoDe = new java.sql.Timestamp(formatter.parse(request.getParameter("ngaymode")).getTime());
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
		String err = "";
		if (gioLamBai.equals("0") && phutLamBai.equals("0")) {
			err = "Chưa chọn thời gian làm bài!";
		}
		if (slDe + slTBinh + slKho == 0) {
			err = "Chưa chọn câu hỏi!";
		}
		if (err.length() == 0) {
			bode bode = new bode(maBoDe, tenBoDe, slDe, slTBinh, slKho, mon, soLanLamBai, ngayMoDe, ngayDongDe,
				thoiGianLamBai, lopGiaoDe);
			//bdf.TaoBoDe(bode);
			HttpSession session = request.getSession();
			cauhoif chf = new cauhoif();
			ArrayList<cauhoi> ch = chf.getquestion(mon, slDe, slTBinh, slKho);
			{	
				session.setAttribute("sluong", slDe+slTBinh+slKho);
				session.setAttribute("mabode", maBoDe);
				session.setAttribute("listcauhoi", ch);
				url = "TaoDeThi";
			} 
		}
		else{
			request.setAttribute("err", err);			
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
