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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import function.monhocf;
import function.nguoidungf;
import model.monhoc;
=======
import function.nguoidungf;
import model.cauhoi;
>>>>>>> parent of 660be74... Merge branch 'master' of https://github.com/quangkhait98/thitracnghiem
import model.nguoidung;
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
import model.cauhoi;
=======
import model.cauhoi;
>>>>>>> parent of c216beb... phan lop
=======
import model.cauhoi;
>>>>>>> parent of c216beb... phan lop

@WebServlet("/testf")
@MultipartConfig
public class testf extends HttpServlet {

	private static final long serialVersionUID = 1L;
	cauhoif chf = new cauhoif();
    public testf() {
        super();
        
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	nguoidungf nguoidungf = new nguoidungf();
	nguoidungf.kiemTraDangNhap("aaa", "aaaa");
	} 
=======
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop

		

	}
>>>>>>> parent of c216beb... phan lop



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
