package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/add")
public class add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String x_ = req.getParameter("x");
		String y_ = req.getParameter("y");
		
		int x = 0;
		int y = 0;
		
		if(x_ != null && !x_.equals(""))
		{
			x = Integer.parseInt(req.getParameter("x"));

		}
		if(y_ != null && !y_.equals(""))
		{
			y = Integer.parseInt(req.getParameter("y"));
		}

		out.print(x+y);
		
		resp.getWriter().printf("result is %d\n", x+y);
		
		
	}
}
