package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.lophocf;
import model.lophoc;

/**
 * Servlet implementation class classmanage
 */
@WebServlet("/classmanage")
public class classmanage extends HttpServlet {
	private static final long serialVersionUID = 1L;
      lophocf lhf = new lophocf();
      
  
    public classmanage() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<lophoc> getclass=lhf.getttlophoc();
		if(getclass!= null || getclass.size()>0)
		{
			request.setAttribute("getclass", getclass);
		}
		request.getRequestDispatcher("classmanage.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<lophoc> getclass=lhf.getttlophoc();
		if(getclass!= null || getclass.size()>0)
		{
			request.setAttribute("layclass", getclass);
		}
		request.getRequestDispatcher("tableclass.jsp").forward(request, response);
	}

}
