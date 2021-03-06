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
	private String copyright = "";
	
	public void init() {
		copyright = getServletContext().getInitParameter("copyright");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String brand = request.getParameter("brand");
		String [] extras = request.getParameterValues("extra");
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
		if (extras != null && extras.length > 0) {
			String extrasText = "";
			for (int i = 0; i<extras.length; i++) {
				if (extrasText.length() > 0) {
					extrasText += ", ";
				}
				extrasText += extras[i];
			}
			res.append(p("plus " + extrasText));			
		}
		res.append(p(copyright));
		res.append("</body>");
		res.append("</html>");

		out.println(res.toString());
	}
	
	private String p(String text) {
		return "<p>" + text + "</p>";
	}
		
}
