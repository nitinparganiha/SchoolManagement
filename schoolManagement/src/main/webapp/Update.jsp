<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="schoolManagement.dto.Teacher"%>
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
        font-size: 30px;
        margin-left: 250px;
        
        padding-top:5                                                                                                                                                                                                                                                                                                                                                                                                   px; 
         }
         #uform{

         margin-left: 250px;
         width:300px;
         color: white;
         font-size: 20px;
         font-family: cursive;
         }
         .sup{
         margin-left:0px;
        box-shadow: 0px 0px 2px 3px;
        width: 450px;
        height:35px;
        border-radius: 15px;
        font-family: cursive;
        background-color: transparent;
        color: white;
        text-align: center;
        margin-bottom: 15px;
        border: 2px solid red;
        display: flex;
         }
         
          #sub{
        margin-left:0px;
        background-color: green;
        box-shadow: 0px 0px 2px 3px;
        width: 450px;
        height:35px;
        border-radius: 15px;
        font-family: cursive;
        margin-top:50px;
        color: white;
        text-align: center;
        margin-bottom: 0px;
         }
         #sub:hover {
         background-color: orange;
         }
         
                          #nav2 {
            font-family: Verdana, Geneva, Tahoma, sans-serif;
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
                    <li><a href="UpdateAndAssign.html">Home</a></li>
                    <li><a href="About.html">About</a></li>
                    <li><a href="Course.html">Cource</a></li>
                    <li><a href="">Contact</a></li>
                    <li><a href="LogAndSign.html">Log Out</a></li>
                </ul>
            </div>

<p id="rname">Update Here</p>
<%
HttpSession s1=request.getSession();
Teacher t1= (Teacher)s1.getAttribute("teacher");

%>
<div id="uform">
<form action="Update" method="post">
ID: <input type="text" name="id" value="<%= t1.getId() %>" class="sup"><br>
Name: <input type="text" name="name" value="<%=t1.getName() %>" class="sup"><br>
Subject: <input type="text" name="sub" value="<%= t1.getSubject()%>" class="sup"><br>
Age: <input type="number" name="age" value="<%=t1.getAge()%>" class="sup"><br>
Password: <input type="password" name="pass" value="<%= t1.getPass() %>" class="sup"><br>
<input type="submit" value="Update" id="sub">
</form>
</div>
</div>
</body>
</html>