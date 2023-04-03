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

import schoolManagement.dto.Management;
@WebServlet("/manage")
public class AddmanagementControll extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String s1=req.getParameter("id");
	String s2=req.getParameter("name");
	String s3=req.getParameter("pass");
	
	int id=Integer.parseInt(s1);		
	int pass=Integer.parseInt(s3);
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Management m=new Management();
	m.setId(id);
	m.setName(s2);
	m.setPass(pass);
	
	et.begin();
	em.persist(m);
	et.commit();
	PrintWriter pw=resp.getWriter();
	pw.write("Please Log In here");
	RequestDispatcher r=req.getRequestDispatcher("LogAndSign.html");
	r.include(req, resp);
	resp.setContentType("text/html");
	
}


}
