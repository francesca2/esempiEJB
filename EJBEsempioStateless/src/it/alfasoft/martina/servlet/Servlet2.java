package it.alfasoft.martina.servlet;

import it.alfasoft.martina.IContatoreLocale;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/test2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private IContatoreLocale cntBean;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("Ciao "+cntBean.incrementa());
		
		
	}
}
