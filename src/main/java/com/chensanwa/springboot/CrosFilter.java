package com.chensanwa.springboot;

import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
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

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String origin = request.getHeader("Origin");
        if(!StringUtils.isEmpty(origin)){
            //设置响应头，允许跨域访问
            //带cookie请求时，必须为全匹配，不能使用*
            response.addHeader("Access-Control-Allow-Origin",origin);
        }

        response.addHeader("Access-Control-Allow-Methods","*");

        //支持所有自定义头
        String headers = request.getHeader("Access-Control-Request-Headers");
        if(!StringUtils.isEmpty(headers)){
            //允许JSON请求，并进行预检命令缓存
            response.addHeader("Access-Control-Allow-Headers",headers);
        }

        response.addHeader("Access-Control-Max-Age","3600");

        //允许cookie
        response.addHeader("Access-Control-Allow-Credentials","true");
        filterChain.doFilter(servletRequest,response);
    }

    @Override
    public void destroy() {

    }
}
