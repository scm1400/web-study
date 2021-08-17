package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("before filter");
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
		
		System.out.println("after filter");

	}

}

// web.xml에 적용하는 방식
/* <filter>
 * 	<filter-name>characterEncodingFilter</filter-name>
 *  <filter-class>com.newlecture.web.filter.CharacterEncodingFilter</filter-class>
 * </filter>
 * <filter-mapping>
 *  <filter-name>characterEncodingFilter</filter-name>
 *  <url-pattern>/*</url-pattern>
 * </filter-mapping>
 */
