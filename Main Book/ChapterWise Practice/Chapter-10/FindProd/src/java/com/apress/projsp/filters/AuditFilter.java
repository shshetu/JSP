/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp.filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author J2EE 37
 */
@WebFilter(filterName = "AuditFilter", urlPatterns = {"/*"})
public class AuditFilter implements Filter {

    private FilterConfig filterConfig = null;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        String remoteAddress = request.getRemoteAddr(); //we will get the address
        String remoteHost = request.getRemoteHost(); // get the remoteHost()
        HttpServletRequest myReq = (HttpServletRequest) request;
        String reqURI = myReq.getRequestURI();
        //we will chain now
        chain.doFilter(request, response);
        filterConfig.getServletContext().log("User at IP "
                + remoteAddress + "(" + remoteHost + ") accessed resource " + reqURI + " and used "
                + (System.currentTimeMillis() - startTime) + " ms");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {
    }

}
