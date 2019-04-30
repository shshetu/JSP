package com.shetu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {
	public servlet() {
		super();
		System.out.println("inside the no-arg constructor()::::");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String fullName = firstName + " " + lastName;
		req.setAttribute("name", fullName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	// called for only once
	public void init() throws ServletException {
		super.init();
		System.out.println("Inside the init()::::::");
		System.out.println("Inside the destroy()::::::");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.service(req, resp);
		System.out.println("Inside the service()::::");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Inside the destroy()::::::");
	}

}
