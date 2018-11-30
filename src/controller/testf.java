package controller;

import java.awt.List;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


import function.cauhoif;
import function.monhocf;
import function.nguoidungf;
import model.monhoc;
import model.nguoidung;
import model.cauhoi;

@WebServlet("/testf")
@MultipartConfig
public class testf extends HttpServlet {

	private static final long serialVersionUID = 1L;
	cauhoif chf = new cauhoif();
    public testf() {
        super();
        
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	nguoidungf nguoidungf = new nguoidungf();
	nguoidungf.kiemTraDangNhap("aaa", "aaaa");
	} 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
