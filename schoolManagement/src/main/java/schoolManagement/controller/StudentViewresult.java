package schoolManagement.controller;

import java.io.IOException;
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
import schoolManagement.dto.Result;
import javax.persistence.Query;
import schoolManagement.dto.Student;

@WebServlet("/viewresult")
public class StudentViewresult extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		HttpSession h1=req.getSession();
		Student s1=(Student)h1.getAttribute("dstudent");
		int clss=s1.getClas();
		String eml=s1.getName();
		Query q=em.createQuery("select a from Result a where a.clas=?1 and a.email=?2");
		q.setParameter(1, clss);
		q.setParameter(2, eml);
		List<Result> asg=q.getResultList();	
		HttpSession res=req.getSession();
		res.setAttribute("res", asg);
		System.out.println(asg);
		RequestDispatcher  rd=req.getRequestDispatcher("studentresult.jsp");
		rd.forward(req, resp);
	}
}
