package schoolManagement.controller;

import java.io.IOException;

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

import schoolManagement.dto.Teacher;
@WebServlet("/Update")
public class UpdateTeacherP extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String subject =req.getParameter("sub");
	String age =req.getParameter("age");
	String Password=req.getParameter("pass");
	
	int id1=Integer.parseInt(id);
	int ag=Integer.parseInt(age);
	int pas=Integer.parseInt(Password);
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Teacher t=new Teacher();
	t.setId(id1);
	t.setName(name);
	t.setSubject(subject);
	t.setAge(ag);
	t.setPass(pas);
	
	et.begin();
	em.merge(t);
	et.commit();
	
	RequestDispatcher r=req.getRequestDispatcher("UpdateAndAssign.html");
	r.forward(req, resp);
}
}
