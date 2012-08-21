package com.tritowntim.simple;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ELServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;
	
	Counter c = new Counter();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("thisCounter", c); 
		RequestDispatcher view = req.getRequestDispatcher("count-el.jsp");
		view.forward(req, resp);
	}

}
