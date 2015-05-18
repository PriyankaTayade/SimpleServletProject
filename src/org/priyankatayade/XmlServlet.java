package org.priyankatayade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//simple doget by annotaion method
		//System.out.println("Hello from my GET method");
		//PrintWriter writer= response.getWriter();
		//writer.print("<h3> Hello in HTML </h3>");*/
		//using web.xml configuration
		System.out.println("Hello from Xml servlet get method");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		String userName= request.getParameter("userName");
		out.print("<h3> Hello in XML servlet get method "+userName+" </h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hello from Xml servlet post method ");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		out.print("<h3> Hello in XML servlet post method "+firstName+" "+lastName+" </h3>");
		String prof=request.getParameter("prof");
		out.println(prof);
		String[] location=request.getParameterValues("location");
		out.println(location.length +" "+"places");
		for(int i=0;i<location.length;i++)
		{
			out.println(location[i]);
		}
	}

}
