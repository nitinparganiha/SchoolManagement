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

import schoolManagement.dto.Student;
@WebServlet("/studentUpadte")
public class StudentUpdate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String cls=req.getParameter("class");
		String age=req.getParameter("age");
		String address=req.getParameter("address");
		String pass=req.getParameter("pass");
		
		int idd=Integer.parseInt(id);
		int agg6=Integer.parseInt(age);
		int pas=Integer.parseInt(pass);
		int clas=Integer.parseInt(cls);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s= new Student();
		s.setId(idd);
		s.setName(name);
		s.setClas(clas);
		s.setAge(agg6);
		s.setAddress(address);
		s.setPass(pas);
		
		et.begin();
		em.merge(s);
		et.commit();
		PrintWriter pw=resp.getWriter();
		pw.write("Update Successfully");
		RequestDispatcher rd=req.getRequestDispatcher("StudentManage1.html");
		rd.include(req, resp);
		resp.setContentType("text/html");
		
	}
}
