package Telstra;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Basic extends HttpServlet{
	private String message;
	public void init() throws ServletException{
		
		message="Welcome to Servelet reponse";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>"+message+"</h1>");
	}
	
	public void destroy() {
		//do nothing
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
