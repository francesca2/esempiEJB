package it.alfasoft.francesca.servlet;

import it.alfasoft.francesca.IContatoreLocale;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletProva
 */
@WebServlet("/test")
public class ServletProva extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IContatoreLocale cntBean;
	
	@EJB
	private IContatoreLocale cntBean2;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("Primo: "+cntBean.incrementa());
		cntBean.incrementa();
		writer.println("Secondo: "+cntBean2.incrementa());
		
		
	}

}
