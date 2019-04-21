package firstJsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class FirstJsp extends HttpServlet {
////doGet
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		// collect the data from the jsp file
////		String fname = req.getParameter("fname");
////		String lname = req.getParameter("lname");
////		String fullName = fname + " " + lname;
////		System.out.println(fullName);
//		doPost(req, resp);
//	}

	// doPOst
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// collect the data from the jsp file
		String fname = req.getParameter("fname"); // collect data from the index.html using request method
		String lname = req.getParameter("lname");
		String fullName = fname +" "+lname;
//		System.out.println(fullName);
		
		//we are using PrintWriter method to print data in the browser
		//we use PrintWriter to respond
//		PrintWriter out = resp.getWriter();
////		out.println("My name is "+fullName);
//		out.println("<html><body><h1>My name is: "+fullName+ "</h1></body></html>");
		
		//we can redirect to an external url
//		resp.sendRedirect("http://www.google.com");
		
		//we can redirect to an internal url
		resp.sendRedirect("test.html");
	}
}
