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

import function.lophocf;
import function.nguoidungf;
import model.lophoc;
import model.nguoidung;


@WebServlet("/studentofclass")
public class studentofclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       nguoidungf ngf = new nguoidungf();
 
    public studentofclass() {
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
		lophocf lhf = new  lophocf();
		ArrayList<lophoc> lh= lhf.getclass();
		if(lh != null || lh.size()>0)
			
		{	java.util.List<nguoidung> nga = ngf.getstudent(lh.get(0).getMalop());
			java.util.List<nguoidung> ng = ngf.svkothuoclop(lh.get(0).toString());
			
			if(ng !=null || ng.size()>0)
			{
				request.setAttribute("chonsv", ng);
			}
			request.setAttribute("chonlop", lh);
			request.setAttribute("studenta", nga);
			
		}
		request.getRequestDispatcher("studentmanage.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String idclass = request.getParameter("classID");
		Boolean err=false;
		StringBuilder errors = new StringBuilder();
		if(idclass == null || idclass.length()==0)
		{
			err=true;
			errors.append("lớp không đúng");
		}
		if(!err)
		{
			List<nguoidung> ng = ngf.getstudent(idclass);
			request.setAttribute("student", ng);
		}
		request.getRequestDispatcher("studenttable.jsp").forward(request, response);
	}

}
