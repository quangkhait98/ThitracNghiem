package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.monhocf;
import model.monhoc;
import model.nguoidung;


@WebServlet("/questionmanage")
public class questionmanage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public questionmanage() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(false);
		if(ses!= null)
		{
			nguoidung nd =(nguoidung) ses.getAttribute("login");
			if(nd != null)
			{
				String quyen = nd.getQuyen();
				if(quyen.equals("questionmanager"))
				{
					
					
				}else if(quyen.equals("student"))
				{
					response.sendRedirect("");
				}else if(quyen.equals("creator"))
				{
					response.sendRedirect("");
				} else
				{
					response.sendRedirect("");
				}
			}
		}
		String submit = request.getParameter("submit");
		monhocf mhf = new monhocf();
		ArrayList<monhoc> mh = mhf.getmonhoc();
		if(mh != null && mh.size()>0)
		{
			request.setAttribute("chonmon", mh);
		}
		if(submit !=null)
		{
			
		}
		else
		{
			
		}
	
		request.getRequestDispatcher("questionmanage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
