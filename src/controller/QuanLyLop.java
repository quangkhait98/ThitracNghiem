package controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuanLyLop")
public class QuanLyLop extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QuanLyLop() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		byte[] array = new byte[10];
		new Random().nextBytes(array);
		String maLop = new String(array, Charset.forName("UTF-8"));
		String tenLop = request.getParameter("tenlop");
	}

}
