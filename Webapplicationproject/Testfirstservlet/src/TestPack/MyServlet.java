package TestPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void  doGet(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Get Method Called");
	}
	protected void  doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		out.println("<html>");
		out.println("<head>");
		out.println("<tittle>");
		out.println("Welcome Page");
		out.println("</tittle>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome the sum is "+(x+y)  + "</h1>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("Post Method Called");
	}

}
