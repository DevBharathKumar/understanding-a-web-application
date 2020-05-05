package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		//For getting request from the browser
		String requestName = request.getParameter("name");
		
		//For setting the data to be used in the JSP
		request.setAttribute("name", requestName);
		
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}

}
