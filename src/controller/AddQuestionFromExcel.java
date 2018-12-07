package controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import function.cauhoif;
import function.monhocf;
import model.cauhoi;
import model.monhoc;
import model.nguoidung;


@WebServlet("/AddQuestionFromExcel")
@MultipartConfig
public class AddQuestionFromExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       cauhoif chf = new cauhoif();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddQuestionFromExcel() {
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
		Part excelpart = request.getPart("fileexcel");
		StringBuilder err = new StringBuilder("");
		boolean error = false;
		if(excelpart==null)
		{
			error = true;
			err.append("không nhận được file excel");
		}
		if(!error)
		{
			try(InputStream excelInp = excelpart.getInputStream();)
			{
				
				List<cauhoi> questions = chf.getquestionsFromExcel(excelInp);
				if(questions !=  null)
				{
					int leng = questions.size();
					if(leng >0)
					{
						if(chf.addquestionfromexcel(questions))
						{
							request.setAttribute("thongbao", String.format("đã thêm %d câu hỏi", leng));
						}
						else {
							err.append("> Thêm các câu hỏi thất bại.<br />");
							request.setAttribute("err", err);
						}
					}
				} else {
					err.append("> Không lấy được các câu hỏi trong file Excel.<br />");
					request.setAttribute("err", err);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			request.setAttribute("err", err);
}
		this.doGet(request, response);
	}
	
}
