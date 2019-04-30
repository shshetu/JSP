package com.shetu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String fullName = firstName + " " + lastName;
//	System.out.println(fullName);
//	#1. we can also use sendRedirect where we can pass the output directly to our desired website
//	resp.sendRedirect("output.jsp");

//		// #2. We use RequestDispatcher to dispatch it to the output.jsp page
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
//		// Now use forward method
//		dispatcher.forward(req, resp);

		// #3. We send the object using req.setAttribute()
		req.setAttribute("name", fullName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		dispatcher.forward(req, resp);
	}
}
