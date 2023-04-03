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

import schoolManagement.dto.Student;
import javax.persistence.*;

@WebServlet("/Slogin")
public class LoginStudent extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String name=req.getParameter("name");
	 String pass=req.getParameter("pass");
	 
	 int pass1=Integer.parseInt(pass);
	 
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 
	 Query q=em.createQuery("select a from Student a where a.name=?1 and a.pass=?2");
	 q.setParameter(1, name);
	 q.setParameter(2, pass1);
	 List<Student> student=q.getResultList();
	 Student s= student.get(0);
	 
	 if(student.size()>0) {
		 
		 HttpSession s1=req.getSession();
		 s1.setAttribute("dstudent", s);
		 
		 RequestDispatcher rd=req.getRequestDispatcher("StudentManage1.html");
		 rd.forward(req, resp);
	 }else{
		 PrintWriter pr=resp.getWriter();
			pr.write("Please write a correct Email and password");
			RequestDispatcher r1=req.getRequestDispatcher("LoginManagement.html");
			r1.include(req, resp);
			resp.setContentType("text/html");
	 }
}
}
