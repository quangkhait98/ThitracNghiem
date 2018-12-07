package controller;

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


@WebServlet("/homepagestd")
public class homepagestd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	nguoidungf ngf = new nguoidungf();
	bodef bdf = new bodef();
	lophocf lh = new lophocf();
    public homepagestd() {
        super();
 
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
		java.util.List<lophoc> lhp = lh.getclassstd("SV2");
		for (lophoc lophoc : lhp) {
			System.out.print(lophoc.getMalop()+" "+ lophoc.getTenlop());
		}
		if(lhp !=null)
		{
			request.setAttribute("lophoc", lhp);
		}
	java.util.List<pagehome> ph = bdf.loadhomepage(lhp);
	for (pagehome pagehome : ph) {
		System.out.print(pagehome.getMabode()+" "+ pagehome.getTenbode()+" "+ pagehome.getThoigianbatdau()+" "+pagehome.getThoigianketthuc());
	}
	if(ph != null || ph.size()>0)
	{
		request.setAttribute("dethi", ph);
	}
	request.getRequestDispatcher("student-exam.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
