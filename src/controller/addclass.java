package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.lophocf;

/**
 * Servlet implementation class addclass
 */
@WebServlet("/addclass")
public class addclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       lophocf lhf = new lophocf();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addclass() {
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
		request.setCharacterEncoding("utf-8");
		String malop = request.getParameter("malop");
		String tenlop = request.getParameter("tenlop");
		Boolean err=false;
		StringBuilder errors = new StringBuilder();
		if(malop==null || malop.length()==0 || tenlop==null ||tenlop.length()==0)
		{
			err=true;
			errors.append("nhập chưa đầy đủ thông tin");
		}
		if(!err)
		{
			if(lhf.addclass(malop, tenlop)>0)
			{
				request.setAttribute("success", 
						String.format("\u2713\u2713 thêm thành công."));
				request.getRequestDispatcher("Success.jsp").forward(request, response);
				return;
			} 
			else {
				errors.append(String.format(">thêm thất bại.<br />"));
				request.setAttribute("errors", errors);
			}
		}else {
			request.setAttribute("errors", errors);
		}
		request.getRequestDispatcher("Errors.jsp").forward(request, response);
	}

}
