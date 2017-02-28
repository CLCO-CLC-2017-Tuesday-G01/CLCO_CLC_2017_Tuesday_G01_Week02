package com.app;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CC_Demo_AppServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello team 1");
	}
}
