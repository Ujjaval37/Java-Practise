package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig scg = getServletConfig();
		out.println(scg.getInitParameter("email"));
		//throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
