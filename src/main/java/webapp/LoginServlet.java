package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	UserValidationService userService = new UserValidationService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		if(userService.isValidUser(request.getParameter("name"), request.getParameter("password"))) {
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "Sorry Invalid Credentials. Please try again :( ");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}
	}

}
