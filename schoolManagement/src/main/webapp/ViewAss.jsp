<%@page import="java.text.Normalizer.Form"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="com.mysql.cj.Query"%>
<%@page import="schoolManagement.dto.Assignment"%>
<%@page import="schoolManagement.dto.Assignment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
        @-ms-viewport {
            width: device-width;
        }

        *{
            margin: 0;
            padding: 0;
        }

        #bd{
            background-image: url(loginimg.jpg);
            background-repeat: no-repeat;
            background-size: cover;
            margin: 0;
            padding: 0;
            height: 100vh;
            width: 100%;
        }
        #rname{
        font-weight: bolder;
        font-family: cursive;
        color:white;
        font-size: 40px;
        margin-left: 200px;
        
        padding-top:5                                                                                                                                                                                                                                                                                                                                                                                                   px; 
         }
        .col{
            padding: 10px 40px;
            color:white;
            font-weight: bolder;
            font-size: 15px;
            font-family: cursive; 
        }
        .head{
        color:white;
        font-weight: bolder;
        font-size: 25px;
        font-family: cursive;      
        
        }
        
       #nav2 ul {
         
        display: flex;
        list-style: none;
        margin-left: 500px;
        position: absolute;

        }
        
        #nav2 ul li a{
        text-decoration: none;
         padding-right: 60px;
            color: orange;
        }
        #nav2 ul li a:hover {
        color: red;
}
</style>
</head>
<body>
<div id="bd">
<div id="nav2">
                <ul>
                    <li><a href="StudentManage1.html">Home</a></li>
                    <li><a href="About.html">About</a></li>
                    <li><a href="Course.html">Cource</a></li>
                    <li><a href="Contact.html">Contact</a></li>
                    <li><a href="LogAndSign.html">Log Out</a></li>
                </ul>
            </div>
<p id="rname">Assignment</p>
<%
HttpSession h = request.getSession();
List<Assignment>l= (List)h.getAttribute("AsgList");
%>
<%
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nitin");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
%>


	<table>
	<tr>
		<th class="head">Id</th>
		<th class="head">Assignment</th>
		<th class="head">Class</th>
		<th class="head">Subject</th>
		<th class="head">Date</th>
		<th class="head">Marks</th>
	</tr>

<%
for(int i=0;i<l.size();i++){
	Assignment a=l.get(i);
	%>
	

	<tr>
		<td class="col"> <%= a.getAssignmentid() %> </td>
		<td class="col"> <%= a.getAssignment() %> </td>
		<td class="col"> <%= a.getClas() %> </td>
		<td class="col"> <%= a.getSubject() %> </td>
		<td class="col"> <%= a.getDate() %> </td>
		<td class="col"> <%= a.getMarks() %> </td>
	</tr>
	
	<% } %>
</table>

</div>

</body>
</html>