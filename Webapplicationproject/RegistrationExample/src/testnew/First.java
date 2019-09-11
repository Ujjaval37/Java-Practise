package testnew;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		if(age>19)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/Second");
			out.println("You are elegible" + name);
			rd.forward(request, response);
		}
		else 
		{
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			out.println("<font color=blue> Age should be more than 19 </font>");
			rd.include(request, response);
		}




		//response.getWriter().append("Served at: ").append(request.getContextPath());


		/*protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doGet(request, response);*/
		}

	}
