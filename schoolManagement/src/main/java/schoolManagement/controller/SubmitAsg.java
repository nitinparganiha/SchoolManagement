package schoolManagement.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Blob;

@WebServlet("/submitassign")
public class SubmitAsg extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String email=req.getParameter("email");
		String clas=req.getParameter("class");
		String subject=req.getParameter("subject");
		String date=req.getParameter("date");
//		 String file=req.getParameter("file");
		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		System.out.println(file);
	}
}
