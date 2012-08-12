package com.tritowntim.simple;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class CountingServletRequestListener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent event) {
		synchronized (event.getServletContext()) {
			int i = 0;
			if (event.getServletContext().getAttribute("requestCounter") != null) {
				i = ((Integer) event.getServletContext().getAttribute("requestCounter")).intValue();
			}
			event.getServletContext().setAttribute("requestCounter", i + 1);
			event.getServletContext().log("requests = " + event.getServletContext().getAttribute("requestCounter"));
		}
	}

	public void requestDestroyed(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		
	}

}
