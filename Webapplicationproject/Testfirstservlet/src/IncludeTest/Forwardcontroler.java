package IncludeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;

@WebServlet("/Forwardcontroler")
public class Forwardcontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			    String un = request.getParameter("username");
			    String pass = request.getParameter("pwd");
			    response.setContentType("text/html");
			    PrintWriter out = response.getWriter();
			    out.println("<b>welcome to forwardcontroler Second servlet</b>");
			    out.println("<b>user name is"+ un + "</b>");
			    out.println("<br>");
			    out.println("<br>");
			    out.println("<br>");  
			    RequestDispatcher dis = request.getRequestDispatcher("/Testcontroler");
			    dis.forward(request, response);
		
			}	

	}


