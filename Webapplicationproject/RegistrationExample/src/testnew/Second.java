package testnew;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 String name = request.getParameter("name");
		 String age = request.getParameter("age");
		 response.setContentType("text/html");
		 out.println("<b>welcome to page</b>");
		 out.println("Name is .. "+ name + "Age is .. " + age + "</b>");
	}

}
