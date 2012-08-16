package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEndServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String p(String text) {
		return "<p>" + text + "</p>";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		Date today = new Date();
		String title = "Session End Servlet";
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>" +  title + "</title></head>");
		res.append("<body>");
		res.append("<h4>" + title + "</h4>");
		res.append(p(today.toLocaleString()));
		res.append(p(request.getRequestURI()));
		res.append(p("session ended"));
		res.append(p("<a href=\"sess\">login<//a>"));
		res.append("</body>");
		res.append("</html>");

		PrintWriter out = response.getWriter();
		out.println(res.toString());
	}
}
