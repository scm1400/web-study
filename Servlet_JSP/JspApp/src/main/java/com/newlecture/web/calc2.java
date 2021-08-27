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
		 * Application 객체와 Session 객체의 차이점
		 * Application 객체는 Application범주(전역)에서 사용가능 
		 * Session 객체는 Session 범주에서 사용 -> 사용자마다 공간이 달라짐
		 * 같은 종류의 브라우저는 SID가 같음. ( 크롬과 파이어폭스 두개로 키면 SID가 다름)
		 * 다른사람의 SID를 복사해서 붙여넣으면 같은 사람으로 인식한다.
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
			
			//쿠키의 생명
			//MaxAge라는 옵션을 설정하지 않으면 브라우저가 닫힐때 쿠키도 사라짐
			//MaxAge => 브라우저가 닫히더라도 외부파일로 저장
		
			/* Application/Session/Cookie 차이점
			 * Application { 범위: 전역, 생명주기: WAS 시작부터 종료, 저장위치: WAS서버 메모리 }
			 * Session { 범위: 세션 범위에서 사용하는 저장 공간, 생명주기: 세션 종료까지, 저장위치: WAS서버 메모리}
			 * Cookie { 범위: Web Browser별 지정한 Path 범주, 생명주기: 만료시간까지, 저장위치: Web Browser메모리 또는 외부파일 }
			 * 기간이 길게 필요하면 무조건 쿠키 
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
