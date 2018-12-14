package controller.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.bodef;
import function.lophocf;
import function.nguoidungf;
import model.lophoc;
import model.nguoidung;
import model.pagehome;

/**
 * Servlet implementation class student
 */
@WebServlet("/student")
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		bodef bdf = new bodef();
		lophocf lh = new lophocf();
		String url = "";
		if (session != null) {
			nguoidung nd = (nguoidung) session.getAttribute("login");
			if (nd != null) {
				String quyen = nd.getQuyen();
				if (quyen.equals("student")) {
					java.util.List<lophoc> lhp = lh.getclassstd(nd.getManguoidung());
					if (lhp != null) {
						request.setAttribute("lophoc", lhp);
					}
					java.util.List<pagehome> ph = bdf.loadhomepage(lhp);
					if (ph != null) {
						request.setAttribute("dethi", ph);
					}
					url = "WEB-INF/student/student-exam.jsp";
				}
				if (quyen.equals("questionmanager")) {

					url = "WEB-INF/questionmanager/addquestion.jsp";
				}
				if (quyen.equals("exammanager")) {

					url = "WEB-INF/exammanager/exammanage.jsp";
				}
				if (quyen.equals("classmanager")) {
					url = "WEB-INF/classmanager/classmanage.jsp";
				}

			} else {
				url = "WEB-INF/user/login.jsp";
			}
		}

		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
