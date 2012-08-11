package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;

	private String p(String text) {
		return "<p>" + text + "</p>";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		Date today = new Date();
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>Simple Servlet</title></head>");
		res.append("<body>");
		res.append(p(today.toLocaleString()));
		res.append(p(request.getRequestURI()));
		res.append("</body>");
		res.append("</html>");
		out.println(res.toString());
		
	}
	
}
