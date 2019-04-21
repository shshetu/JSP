package com.udemy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
//doGet
//doPost
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String firstName = req.getParameter("fname");
	String lastName = req.getParameter("lname");
	String fullName = firstName+lastName;
	System.out.println(fullName);
	}
}
