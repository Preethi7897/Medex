package org.medex.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.medex.beans.User;
import org.medex.service.LoginService;
import org.medex.service.LoginServiceImpl;

@WebServlet("/login_serv")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService log_serv = new LoginServiceImpl();
	User u = new User();
	User res = new User();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("pid");
		String pwd = request.getParameter("pwd");

		String role = "";
		u.setId(id);
		u.setPwd(pwd);
		res = log_serv.validateUser(u);
		if (res == null) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

		else {
			role = res.getRole();
			if (role.contentEquals("patient")) {

				request.setAttribute("name", res.getName());
				RequestDispatcher rd = request.getRequestDispatcher("patient.jsp");
				rd.forward(request, response);
			} else if (role.contentEquals("doctor")) {
				request.setAttribute("name", res.getName());
				RequestDispatcher rd = request.getRequestDispatcher("doctor.jsp");
				rd.forward(request, response);
			}
		}
		pw.close();

	}

}
