package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/calc2")
public class calc2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		ServletContext application = req.getServletContext();
		HttpSession session = req.getSession();
		Cookie[] cookies = req.getCookies();
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String v_ = req.getParameter("v");
		String button = req.getParameter("button");
		
		int v = 0;
		
		if(v_ != null && !v_.equals(""))
		{
			v = Integer.parseInt(req.getParameter("v"));

		}
		

		/*
		 * Application ��ü�� Session ��ü�� ������
		 * Application ��ü�� Application����(����)���� ��밡�� 
		 * Session ��ü�� Session ���ֿ��� ��� -> ����ڸ��� ������ �޶���
		 * ���� ������ �������� SID�� ����. ( ũ�Ұ� ���̾����� �ΰ��� Ű�� SID�� �ٸ�)
		 * �ٸ������ SID�� �����ؼ� �ٿ������� ���� ������� �ν��Ѵ�.
		 * 
		 */

		if(button.equals("="))
		{
//			int x = (Integer)application.getAttribute("value");
//			int x = (Integer)session.getAttribute("value");
//			String operator = (String)application.getAttribute("button");
//			String operator = (String)session.getAttribute("button");
			
			int x = 0;
			int y = v;
			
			for(Cookie c : cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}
			
			String operator = "";
			for(Cookie c : cookies) {
				
				if(c.getName().equals("button")) {
					operator = c.getValue();
					break;
				}
			}
			
			int result = 0;
			if(operator.equals("+"))
				result = x+y;
			else
				result = x-y;
			
			resp.getWriter().printf("%d",result);
		}
		else {

			//session.setAttribute("value", v);
			//session.setAttribute("button", button);
//			application.setAttribute("value", v);
//			application.setAttribute("button", button);
			
			//��Ű�� ����
			//MaxAge��� �ɼ��� �������� ������ �������� ������ ��Ű�� �����
			//MaxAge => �������� �������� �ܺ����Ϸ� ����
		
			/* Application/Session/Cookie ������
			 * Application { ����: ����, �����ֱ�: WAS ���ۺ��� ����, ������ġ: WAS���� �޸� }
			 * Session { ����: ���� �������� ����ϴ� ���� ����, �����ֱ�: ���� �������, ������ġ: WAS���� �޸�}
			 * Cookie { ����: Web Browser�� ������ Path ����, �����ֱ�: ����ð�����, ������ġ: Web Browser�޸� �Ǵ� �ܺ����� }
			 * �Ⱓ�� ��� �ʿ��ϸ� ������ ��Ű 
			 */
			
			
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("button", button);
			valueCookie.setPath("/calc2");
			valueCookie.setMaxAge(60);
			opCookie.setPath("/calc2");
			resp.addCookie(valueCookie);
			resp.addCookie(opCookie);
			
			resp.sendRedirect("calc2.html");
		}
			
		
	}
}
