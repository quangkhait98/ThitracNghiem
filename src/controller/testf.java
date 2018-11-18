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

import function.cauhoif;
import function.monhocf;
import model.monhoc;
import model.nguoidung;

@WebServlet("/testf")
public class testf extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	cauhoif cauhoif = new cauhoif();
    public testf() {
        super();
        
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	cauhoif.getquestionsFromExcel();
	} 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
