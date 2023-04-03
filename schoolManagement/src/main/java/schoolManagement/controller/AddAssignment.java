package schoolManagement.controller;

import java.io.IOException;
import java.sql.Date;

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

import schoolManagement.dto.Assignment;

@WebServlet("/asign")
public class AddAssignment extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String aid=req.getParameter("aid");
	String subject=req.getParameter("sub");
	String clas =req.getParameter("class");
	String assign = req.getParameter("assign");
	String marks =req.getParameter("marks");
	String date1 =req.getParameter("date");
	Date date=Date.valueOf(date1);
	int asgid=Integer.parseInt(aid);
	int mark=Integer.parseInt(marks);
	int cls=Integer.parseInt(clas);
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Nitin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Assignment a=new Assignment();
	System.out.println("date format : "+date);
	a.setAssignmentid(asgid);
	a.setSubject(subject);
	a.setClas(cls);
	a.setAssignment(assign);
	a.setMarks(mark);
	a.setDate(date);
//	HttpSession h = req.getSession();
//	h.setAttribute("1",asgid);
//	h.setAttribute("2", date);
//	h.setAttribute("3", subject);
	et.begin();
	em.persist(a);
	et.commit();
	
	RequestDispatcher r=req.getRequestDispatcher("UpdateAndAssign.html");
	r.forward(req, resp);
	
}
}
