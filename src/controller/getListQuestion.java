package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import function.cauhoif;
import model.cauhoi;

@WebServlet("/getListQuestion")
public class getListQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getListQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int slDe = 0, slTBinh = 0, slKho = 0;
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
		cauhoif chf = new cauhoif();
		ArrayList<cauhoi> ch = chf.getquestion(mon, slDe, slTBinh, slKho);
		if(ch != null && ch.size()>0)
		{
			request.setAttribute("question", ch);
		}
		PrintWriter out = response.getWriter();
        response.setCharacterEncoding("UTF8");
        response.setContentType("application/json");
        //Import gson-2.2.2.jar
        Gson gson = new Gson();
        String objectToReturn = gson.toJson(ch); //Convert List -> Json
        out.write(objectToReturn); //Đưa Json trả về Ajax
        out.flush();
	}

}
