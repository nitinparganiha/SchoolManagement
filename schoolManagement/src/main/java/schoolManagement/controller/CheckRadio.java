package schoolManagement.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/checkRadio")
public class CheckRadio extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String role=req.getParameter("role");
		if(role.equals("management")) {
			RequestDispatcher r1=req.getRequestDispatcher("Mlogin");
			r1.forward(req, resp);
		}else if(role.equals("teacher")) {
			RequestDispatcher r1=req.getRequestDispatcher("Tlogin");
			r1.forward(req, resp);
		}else if(role.equals("student")) {
			RequestDispatcher r1=req.getRequestDispatcher("Slogin");
			r1.forward(req, resp);
		}
		
	}
}
