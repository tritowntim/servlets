package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoffeeServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String brand = request.getParameter("brand");
		Date today = new Date();
		String title = "Coffee Ordering";
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>" +  title + "</title></head>");
		res.append("<body>");
		res.append("<h4>" + title + "</h4>");
		res.append(p(today.toLocaleString()));
		res.append(p(request.getRequestURI()));
		res.append(p("Coffee selection: " + brand));
		res.append("</body>");
		res.append("</html>");

		out.println(res.toString());
	}
	
	private String p(String text) {
		return "<p>" + text + "</p>";
	}
		
}
