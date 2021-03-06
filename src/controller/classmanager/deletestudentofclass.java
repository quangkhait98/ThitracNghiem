package controller.classmanager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.nguoidungf;

/**
 * Servlet implementation class deletestudentofclass
 */
@WebServlet("/deletestudentofclass")
public class deletestudentofclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       nguoidungf ngf = new nguoidungf();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletestudentofclass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String studentid = request.getParameter("ID");
		String classid = request.getParameter("classid");
		System.out.print(studentid);
		System.out.print(classid);
		boolean isError = false;
		StringBuilder errors = new StringBuilder();
		if(studentid == null || studentid.trim().isEmpty()||classid == null || classid.trim().isEmpty()) {
			isError = true;
			errors.append("khÃ´ng tÃ¬m tháº¥y sinh viÃªn hoáº·c lá»›p há»�c");
		}
		if(!isError)
		{
			if(ngf.deletestudentofclass(studentid,classid)>0) {
				request.setAttribute("success", 
						String.format("\u2713\u2713 xÃ³a thÃ nh cÃ´ng ."));
				request.getRequestDispatcher("Success.jsp").forward(request, response);
				return;
			} else {
				errors.append(String.format(">xÃ³a tháº¥t báº¡i.<br />"));
				request.setAttribute("errors", errors);
			}
		}
		else {
			request.setAttribute("errors", errors);
		}
		request.getRequestDispatcher("Errors.jsp").forward(request, response);
	}

}
