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

@WebServlet("/Adds")
public class Addstudent extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String id=req.getParameter("id");
	 String name=req.getParameter("name");
	 String clas=req.getParameter("class");
	 String age=req.getParameter("age");
	 String address=req.getParameter("address");
	 String pass=req.getParameter("pass");
	 
	 int id1=Integer.parseInt(id);
	 int pass1=Integer.parseInt(pass);
	 int ag=Integer.parseInt(age);
	 int cls=Integer.parseInt(clas);
	 
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 Student s= new Student();
	 s.setId(id1);
	 s.setName(name);
	 s.setClas(cls);
	 s.setAge(ag);
	 s.setAddress(address);
	 s.setPass(pass1);
	 
	 et.begin();
	 em.persist(s);
	 et.commit();
	 PrintWriter pr=resp.getWriter();
	 pr.write("Add Successfully");
	 RequestDispatcher r=req.getRequestDispatcher("LogAndSign.html");
	 r.include(req, resp);
	 resp.setContentType("text/html");
	 
}
}
