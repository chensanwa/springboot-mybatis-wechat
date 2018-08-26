package com.chensanwa.springboot;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/26
 * Time: 21:41
 */
public class CrosFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Methods","*");
        response.addHeader("Access-Control-Allow-Headers","Content-Type");
        response.addHeader("Access-Control-Max-Age","3600");
        filterChain.doFilter(servletRequest,response);
    }

    @Override
    public void destroy() {

    }
}
