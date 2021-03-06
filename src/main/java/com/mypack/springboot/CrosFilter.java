package com.mypack.springboot;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CrosFilter implements Filter {

	@Override
	public void destroy() {
		//Do Nothing
	}

	@Override
	public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(req, res);
		/*final HttpServletResponse response = (HttpServletResponse) res;
	    response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");

	    // without this header jquery.ajax calls returns 401 even after successful login and SSESSIONID being successfully stored.
	    response.setHeader("Access-Control-Allow-Credentials", "true");

	    response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Authorization, Origin, Content-Type, Version");
	    response.setHeader("Access-Control-Expose-Headers", "X-Requested-With, Authorization, Origin, Content-Type");

	    final HttpServletRequest request = (HttpServletRequest) req;
	    if (!request.getMethod().equals("OPTIONS")) {
	        chain.doFilter(req, res);
	    } else {
	        // do not continue with filter chain for options requests
	    }*/
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//Do Nothing
	}

}
