package com.glodon.springboot.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "helloFilter",urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行前面的代码");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行后面的代码");
    }

    @Override
    public void destroy() {

    }
}
