package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.ketquathif;
import model.ketquathi;

/**
 * Servlet implementation class hienketquathisv
 */
@WebServlet("/hienketquathisv")
public class hienketquathisv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ketquathif kqt = new ketquathif();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hienketquathisv() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ketquathi> kqthi = kqt.getketqua("SV1");
		if(kqthi!=null || kqthi.size()>0)
		{
			request.setAttribute("kqthi", kqthi);
		}
		request.getRequestDispatcher("ketquathisv.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
