package schoolManagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/Addt")
public class Addteacher extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id"); 
	String name=req.getParameter("name");
	String subject=req.getParameter("sub");
	String age =req.getParameter("age");
	String pass=req.getParameter("pass");
	
	
	int id1=Integer.parseInt(id);
	int pass1=Integer.parseInt(pass);
	int ag=Integer.parseInt(age);
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Teacher t=new Teacher();
	t.setId(id1);
	t.setName(name);
	t.setSubject(subject);
	t.setAge(ag);
	t.setPass(pass1);
	
	et.begin();
	em.persist(t);
	et.commit();
	
	PrintWriter pw=resp.getWriter();
	pw.write("Add Successfully");
	RequestDispatcher r=req.getRequestDispatcher("manage1.html");
	r.include(req, resp);
	resp.setContentType("text/html");
}
}
