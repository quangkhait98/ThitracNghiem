package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.bodef;
import model.cauhoi;

@WebServlet("/TaoDeThi")
public class TaoDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TaoDeThi() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String maBoDe = (String) session.getAttribute("mabode");
		int sluong = (int)session.getAttribute("sluong");
		@SuppressWarnings("unchecked")
		ArrayList<cauhoi> ch = (ArrayList<cauhoi>) session.getAttribute("listcauhoi");
		bodef bdf = new bodef();
		 for(int i=0; i < sluong; i++)
		{
			 int maCauHoi = ch.get(i).getMacauhoi();
			 System.out.println(maCauHoi);
			 //bdf.BoDe_CauHoi(maBoDe, maCauHoi);
		}
		// sluong = Integer.parseInt(request.getParameter("sluong"));
		// String first = request.getParameter("first");
		// String last = request.getParameter("last");
		// System.out.println(first);
		// System.out.println(last);

		request.getRequestDispatcher("questionlist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<cauhoi> ch = (ArrayList<cauhoi>) session.getAttribute("listcauhoi");
		session.setAttribute("question", ch);
		request.getRequestDispatcher("exampreview.jsp").forward(request, response);
	}

}
