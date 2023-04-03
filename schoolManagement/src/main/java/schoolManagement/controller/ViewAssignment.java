package schoolManagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.persistence.*;
import schoolManagement.dto.Assignment;
import schoolManagement.dto.Student;
@WebServlet("/ViewAssignment")
public class ViewAssignment extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	HttpSession h1=req.getSession();
	Student s1=(Student)h1.getAttribute("dstudent");
	int clss=s1.getClas();
	Query q=em.createQuery("select a from Assignment a where a.clas=?1");
	q.setParameter(1, clss);
	List<Assignment> asg=q.getResultList();
	
	if(asg.size()>0) {
		HttpSession h2=req.getSession();
		h2.setAttribute("AsgList", asg);
		RequestDispatcher r2=req.getRequestDispatcher("ViewAss.jsp");
		r2.forward(req, resp);
	}else {
		PrintWriter p1=resp.getWriter();
		p1.write("No Assignment");
		RequestDispatcher r1=req.getRequestDispatcher("StudentManage1.html");
		r1.include(req, resp);
		resp.setContentType("text/html");
	}
}
}
