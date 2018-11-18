package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import function.cauhoif;
import function.monhocf;
import model.monhoc;
import model.nguoidung;


@WebServlet("/AddQuestion")
public class AddQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	cauhoif chf= new cauhoif();
    public AddQuestion() {
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
	monhocf mhf = new monhocf();
	ArrayList<monhoc> mh = mhf.getmonhoc();
	if(mh != null && mh.size()>0)
	{
		request.setAttribute("chonmon", mh);
	}
	request.getRequestDispatcher("addquestion.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cauhoi = request.getParameter("cauhoi");
		String chonmon = request.getParameter("chonmon");
		String chonloai =request.getParameter("chonloai");
		String dapan1 = request.getParameter("dapan1");
		String dapan2 = request.getParameter("dapan2");
		String dapan3 = request.getParameter("dapan3");
		String dapan4 = request.getParameter("dapan4");
		int dapandung =Integer.parseInt(request.getParameter("dapandung"));
		String err="";
		if(chonmon == null || chonmon.trim().length() == 0) {
			err="chưa chọn môn !";
		}
		if(chonloai == null || chonloai.trim().length() == 0) {
			err="chưa chọn loại !";
		}
		if(cauhoi == null || cauhoi.trim().length() == 0) {
			err="chưa nhập câu hỏi !";
		}
		if(dapan1 == null || dapan1.trim().length() == 0) {
			err="chưa nhập đáp án đầy đủ !";
		}

		if(dapan2 == null || dapan2.trim().length() == 0) {
			err="chưa nhập đáp án đầy đủ !";
		}

		if(dapan3 == null || dapan3.trim().length() == 0) {
			err="chưa nhập đáp án đầy đủ !";
		}

		if(dapan4 == null || dapan4.trim().length() == 0) {
			err="chưa nhập đáp án đầy đủ !";
		}
		request.setAttribute("cauhoi", cauhoi);
		request.setAttribute("dapan1", dapan1);
		request.setAttribute("dapan2", dapan2);
		request.setAttribute("dapan3", dapan3);
		request.setAttribute("dapan4", dapan4);
		if(err.length()==0)
		{   
			model.cauhoi ch = new model.cauhoi();
			ch.setNoidung(cauhoi);
			ch.setLoaicauhoi(chonloai);
			ch.setDapan1(dapan1);
			ch.setDapan2(dapan2);
			ch.setDapan3(dapan3);
			ch.setDapan4(dapan4);
			ch.setMamon(chonmon);
			ch.setDapandung(dapandung);
			int dem =chf.themcauhoi(ch);
			if(dem>0)
			{
				err="thêm câu hỏi thành công";
			}
			else
			{
				err="thêm câu hỏi thất bại";
			}
			request.setAttribute("err", err);
		}else
		{
			request.setAttribute("err", err);
		}
		this.doGet(request, response);
	}

}
