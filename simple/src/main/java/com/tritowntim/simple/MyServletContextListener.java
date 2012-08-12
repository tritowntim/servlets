package com.tritowntim.simple;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		event.getServletContext().setAttribute("startupTime", (new Date()).toLocaleString());
		System.out.println("LISTENER: context initialized at " + event.getServletContext().getAttribute("startupTime"));
		event.getServletContext().setAttribute("pojo", new Pojo("initialized","context has been initialized"));
	}

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("LISTENER: context destroyed");
	}

}
