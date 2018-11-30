package controller;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.nguoidungf;
import model.nguoidung;

@WebServlet("/dangnhapservlet")
public class dangnhapservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private nguoidungf nguoidungf = new nguoidungf();
    public dangnhapservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(false);
		if(ses != null)
		{
			nguoidung nd = (nguoidung)ses.getAttribute("login");
			if(nd!=null)
			{
				String quyen = nd.getQuyen();
				if(quyen.equals("student"))
				{
					response.sendRedirect("");
				}
				else if(quyen.equals("questionmanager"))
				{
					response.sendRedirect("");
				}
				else if(quyen.equals("creator"))
				{
					response.sendRedirect("");
				}else
				{
					response.sendRedirect("");
				}
				return;
			}
		}
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String manguoidung = request.getParameter("taikhoan");
        String matkhau = request.getParameter("password");
        String err="";
        if(manguoidung.equals("") || matkhau.equals(""))
        {
        	err="nhập đầy đủ thông tin ! ";
        }
        else
        {
        	if(nguoidungf.kiemTraDangNhap(manguoidung, matkhau)==false)
        	{
        		err="tài khoản hoặc mật khẩu không đúng";
        	}
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);
        }
        String url="";
        try {
            if (err.length() == 0) {
            	nguoidung nd = new nguoidung();
            	nd.setManguoidung(manguoidung);
                String t = nguoidungf.getTaiKhoan(manguoidung).getQuyen();
                nd.setQuyen(t);
                nd.setTenNguoiDung(nguoidungf.getTaiKhoan(manguoidung).getTenNguoiDung());
                HttpSession session = request.getSession();
                response.setContentType("text/html;charset=utf-8");
                session.setAttribute("login", nd);
                if (t.equals("student"))
                {                	
                   url = "/student-exam.jsp";
                }
                if (t == "questionmanager") {
                   
                    url = "/questionmagage.jsp";
                }
                if (t == "exammagager") {
                	
                    url = "/exammanage.jsp";
                }
                if (t.equals("classmanager")) {
                    url = "/studentmanage.jsp";
                }
                request.setAttribute("user", nd);

            } else {
                url = "/login.jsp";
            }
            request.getRequestDispatcher(url).forward(request, response);

        } catch (Exception e) {
        }
	}

}
