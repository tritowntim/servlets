package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String email = "";
	private String params = "";
	private String paramValues = "";
	
	public void init() {
		Enumeration e = getInitParameterNames();
		while (e.hasMoreElements()) {
			if (params.length() > 0) {
				params += ", ";
				paramValues += ", ";
			}
			String paramName = (String) e.nextElement(); 
			params += paramName;
			paramValues += getInitParameter(paramName);
		}
		email = getInitParameter("email") + "...";		
	}

	private String p(String text) {
		return "<p>" + text + "</p>";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		Date today = new Date();
		String title = "Init Param Servlet";
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>" +  title + "</title></head>");
		res.append("<body>");
		res.append("<h4>" + title + "</h4>");
		res.append(p(today.toLocaleString()));
		res.append(p("email = " + email));
		res.append(p("init parameter names = " + params));
		res.append(p("init parameter values= " + paramValues));
		res.append("</body>");
		res.append("</html>");
		out.println(res.toString());
		
	}
}
