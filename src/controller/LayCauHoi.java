package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.cauhoif;
import model.cauhoi;

@WebServlet("/LayCauHoi")
public class LayCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LayCauHoi() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession cauhoi = request.getSession();
		String monhoc = (String)cauhoi.getAttribute("monhoc");
		cauhoif chf = new cauhoif();
		ArrayList<cauhoi> ch = chf.getquestion(monhoc);
		if (ch != null && ch.size() > 0) {
			request.setAttribute("cauhoi", ch);
		}
		request.getRequestDispatcher("exampreview.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
