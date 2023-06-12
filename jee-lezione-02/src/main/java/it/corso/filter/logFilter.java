package it.corso.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter(filterName = "log", urlPatterns = {"/login", "/riservata"})
public class logFilter extends HttpFilter implements Filter {
       



	private static final long serialVersionUID = 1100168697420823940L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException 
	{
		HttpServletRequest req = (HttpServletRequest) request;
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("log"))
			{
				req.setAttribute("username", c.getValue());
				break;
			}
		}
		
		
		chain.doFilter(request, response);
	}


}
