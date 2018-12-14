package controller.classmanager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.nguoidungf;
import model.nguoidung;

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
		HttpSession session = request.getSession(false);
		String url = "";
		if (session != null) {
			nguoidung nd = (nguoidung) session.getAttribute("login");
			if (nd != null) {
				String quyen = nd.getQuyen();
				if (quyen.equals("student")) {

					url = "student";
				}
				if (quyen.equals("questionmanager")) {

					url = "questionmanager";
				}
				if (quyen.equals("exammanager")) {
					url = "exammanager";
				}
				if (quyen.equals("classmanager")) {
					url = "classmanager";
				}

			} else {
				url = "WEB-INF/user/login.jsp";
			}
		}

		request.getRequestDispatcher(url).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String classid = request.getParameter("classID");
		String studentID = request.getParameter("stdID");
		boolean isError = false;
		StringBuilder errors = new StringBuilder();
		if(classid == null || classid.trim().isEmpty()||studentID == null || studentID.trim().isEmpty()) {
			isError = true;
			errors.append("Thông tin không đầy đủ");
		}
		if(!isError)
		{
			if(ngf.addstdofclass(studentID,classid)>0) {
				request.setAttribute("success", 
						String.format("\u2713\u2713 thêm thành công."));
				request.getRequestDispatcher("WEB-INF/Success.jsp").forward(request, response);
				return;
			} else {
				errors.append(String.format(">thêm thất bại.<br />"));
				request.setAttribute("errors", errors);
			}
		} else {
			request.setAttribute("errors", errors);
		}
		request.getRequestDispatcher("WEB-INF/Errors.jsp").forward(request, response);
	}
}
