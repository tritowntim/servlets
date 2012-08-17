package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String p(String text) {
		return "<p>" + text + "</p>";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		PrintWriter out = response.getWriter();
		Date today = new Date();
		String title = "Cookie Servlet";
		
		HttpSession sess = request.getSession();
		if (sess.isNew()) {
			response.addCookie(new Cookie("serverTime",today.toLocaleString()));
			response.addCookie(new Cookie("favorite","chocolate chip"));			
		}
		
		if (request.getCookies() != null) {
		for (Cookie c: request.getCookies()) {
			System.out.println(c.getName() + ", " + c.getValue());
		}
		}
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>" + title + "</title></head>");
		res.append("<body>");
		res.append("<h4>" + title + "</h4>");
		res.append(p(today.toLocaleString()));
		res.append(p(request.getRequestURI()));
		res.append("</body>");
		res.append("</html>");
		out.println(res.toString());
	}
	
	

}
