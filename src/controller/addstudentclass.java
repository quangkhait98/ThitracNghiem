package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.nguoidungf;

/**
 * Servlet implementation class addstudentclass
 */
@WebServlet("/addstudentclass")
public class addstudentclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       nguoidungf ngf = new nguoidungf();
  
    public addstudentclass() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String classid = request.getParameter("classID");
		String studentID = request.getParameter("stdID");
		boolean isError = false;
		StringBuilder errors = new StringBuilder();
		if(classid == null || classid.trim().isEmpty()||studentID == null || studentID.trim().isEmpty()) {
			isError = true;
			errors.append("không tìm được lớp hoặc sinh viên hợp lệ");
		}
		if(!isError)
		{
			if(ngf.addstdofclass(studentID,classid)>0) {
				request.setAttribute("success", 
						String.format("\u2713\u2713 thêm thành công."));
				request.getRequestDispatcher("Success.jsp").forward(request, response);
				return;
			} else {
				errors.append(String.format(">thêm thất bại.<br />"));
				request.setAttribute("errors", errors);
			}
		} else {
			request.setAttribute("errors", errors);
		}
		request.getRequestDispatcher("Errors.jsp").forward(request, response);
	}
}
