package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Lifecycleservlet")
public class Lifecycleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException{
		super.init();
		System.out.println("inside init method");
	}

	public Lifecycleservlet() {
		System.out.println("creating obj of lifecycleser..");


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LIfecycleservlet get called");
		PrintWriter out = response.getWriter();
		response.setContentType("test/html");
		out.println("<b> lifecycleservlet get called");
		out.println("Refresh the page to check life cycle method");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);
	}
	public void destroy( ) {
		System.out.println("destroing.....");
		super.destroy();
	}

}
