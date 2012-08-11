package com.tritowntim.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OtherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Date initializedAt;
	private int objectID;
	
	private String p(String text) {
		return "<p>" + text + "</p>";
	}
	
	public void init() {
		initializedAt = new Date();
		objectID = this.hashCode();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String title = "Other Servlet";
		Date today = new Date();
		int thread = Thread.currentThread().hashCode();
		int serverPort = request.getServerPort();
		int localPort = request.getLocalPort();
		int remotePort = request.getRemotePort();
		
		StringBuffer res = new StringBuffer();
		res.append("<html>");
		res.append("<head><title>" +  title + "</title></head>");
		res.append("<body>");
		res.append("<h4>" + title + "</h4>");
		res.append(p(request.getRequestURI()));
		res.append(p("thread " + thread));
		res.append(p("original object " + objectID + " initialized at " + initializedAt.toLocaleString()));
		res.append(p("this object " + this.hashCode() + " accessed at " + today.toLocaleString()));
		res.append(p("ports: remote = " + remotePort + ", server = " + serverPort + ", local = " + localPort));
		res.append("</body>");
		res.append("</html>");

		PrintWriter out = response.getWriter();
		out.println(res.toString());
		
	}
	
}
