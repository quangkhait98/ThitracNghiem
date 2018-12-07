package controller;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import com.google.gson.reflect.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;*/
import function.bodef;
import function.cauhoif;
import function.fullcalendarf;
import function.lophocf;
import function.nguoidungf;
import model.cauhoi;
import model.fullcalendar;
import model.lophoc;
import model.pagehome;

@WebServlet("/testf")
@MultipartConfig
public class testf extends HttpServlet {

	private static final long serialVersionUID = 1L;
	nguoidungf ngf = new nguoidungf();
	bodef bdf = new bodef();
	lophocf lh = new lophocf(); 
	fullcalendarf clf = new fullcalendarf();
    public testf() {
        super();
        
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String mabode = request.getParameter("mabd");
	System.out.println(mabode);
	}
}
