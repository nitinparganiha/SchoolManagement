package schoolManagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

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

import schoolManagement.dto.Result;

@WebServlet("/addresult")
public class Addresult extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String id=req.getParameter("id");
	   String subject=req.getParameter("sub");
	   String marks=req.getParameter("mark");
	   String email=req.getParameter("email");
	   String clas=req.getParameter("class");
	   
	   int id1=Integer.parseInt(id);
	   int mark=Integer.parseInt(marks);
	   int cls=Integer.parseInt(clas);
	   
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   
	   Result r= new Result();
	   
	   r.setId(id1);
	   r.setSubject(subject);
	   r.setMarks(mark);
	   r.setEmail(email);
	   r.setClas(cls);
	   
	   et.begin();
	   em.persist(r);
	   et.commit();
	   PrintWriter pw=resp.getWriter();
	   pw.write("Result add successfully");
	   RequestDispatcher rd=req.getRequestDispatcher("UpdateAndAssign.html");
	   rd.include(req, resp);
	   resp.setContentType("text/html");
}
}
