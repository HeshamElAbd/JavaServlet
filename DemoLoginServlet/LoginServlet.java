package com.vogella.web.filecounter.userInput;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter output = response.getWriter();
		if (password==null) {
			output.println("Please enter your user name");
			return;
		}
		if (password.length()<6) {
			output.println("Your password can not be shorter than 6 chars");
			return;
		}

		response.setContentType("text/html");
		output.println("<html>");
		output.println("<p> Hi "+
		"<i style=\"color:blue\">"+username+"</i> Welcome to The demo<p><br>");
		output.println("<p>your password is "+password+"<br>");
		output.println("We highly recommend that you change it");
		output.println("Thanks a lot for your understanding :)</p>");
		
	}

}
