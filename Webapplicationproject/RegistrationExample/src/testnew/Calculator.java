package testnew;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String prname = request.getParameter("prname");
		int quantity = Integer.parseInt(request.getParameter("qty"));
		response.setContentType("text/html");
		int price=0;
		switch(prname) {
		case "Soap" : price = quantity*50;
		break;
		case "Shampoo" : price = quantity*120;
		break;
		case "Toothbrush" : price = quantity*50;
		break;
		case "Facewash" : price = quantity*50;
		break;
		}
		PrintWriter out = response.getWriter();
		out.println("<b> Price of " + prname +"is " + price + "<b>" );
		
		
		
		
		}

	}


