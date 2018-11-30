package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.cauhoif;
import function.monhocf;
import model.cauhoi;
import model.monhoc;
import model.nguoidung;


@WebServlet("/questionmanage")
public class questionmanage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cauhoif chf = new cauhoif();
	monhocf mhf = new monhocf();
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
					String submit = request.getParameter("submit");
					
					if(submit !=null)
					{
					
					}
					else
					{
						request.getRequestDispatcher("questionmanage.jsp").forward(request, response);
					}
					
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
			this.loadtrang(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chonmon = request.getParameter("chonmon");
		String search = request.getParameter("search");
		String chonloai = request.getParameter("chonloai");
		String strOffset = request.getParameter("offset");
		String strLength =  request.getParameter("length");
		int offset = 0;
		int length = 0;
		Boolean err =false;
		if(chonmon ==null || chonmon.length()==0)
		{
			err=true;
		}
		if(chonloai==null||chonloai.length()==0)
		{
			err=true;
		}
		if(strOffset==null||strOffset.trim().isEmpty())
		{
			err=true;
		}
		if(strLength==null||strLength.trim().isEmpty())
		{
			err=true;
		}
		try {
			offset = Integer.parseInt(strOffset);
			length = Integer.parseInt(strLength);
		} catch (Exception e) {
			// TODO: handle exception
			err=true;
			e.printStackTrace();
		}
		if(!err)
		{	
			java.util.List<cauhoi> ch;
			ch = chf.getquestion(search, chonmon, chonloai, length, offset);
			request.setAttribute("question", ch);		
		}
		request.getRequestDispatcher("tablequestion.jsp").forward(request, response);
	}
	private void loadtrang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<monhoc> mh = mhf.getmonhoc();
		if(mh != null && mh.size()>0)
		{
			request.setAttribute("chonmon", mh);
		}
		request.getRequestDispatcher("questionmanage.jsp").forward(request, response);
	}
	
	
}
