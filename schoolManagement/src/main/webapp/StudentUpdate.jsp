<%@page import="schoolManagement.dto.Student"%>
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
        font-size: 20px;
        margin-left: 250px;
        
        padding-top:5                                                                                                                                                                                                                                                                                                                                                                                                   px; 
         }
         #uform{

         margin-left: 250px;
         width:300px;
         color: white;
         font-size: 20px;
         font-family: cursive;
           margin-top: 30px;
       
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
        margin-bottom: 5px;
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
        margin-top:10px;
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
                    <li><a href="StudentManage1.html">Home</a></li>
                    <li><a href="About.html">About</a></li>
                    <li><a href="Course.html">Cource</a></li>
                    <li><a href="Contact.html">Contact</a></li>
                    <li><a href="LogAndSign.html">Log Out</a></li>
                </ul>
            </div>

<p id="rname">Update Here</p>
<%
HttpSession h1=request.getSession();
Student s1= (Student)h1.getAttribute("dstudent");

%>
<div id="uform">
<form action="studentUpadte" method="post">
ID: <input type="text" name="id" class="sup" value="<%= s1.getId()%>" placeholder="ID"><br>
Email: <input type="email" name="name" class="sup" value="<%= s1.getName()%>" placeholder="Email"><br>
Class: <input type="number" name="class" class="sup" value="<%= s1.getClas()%>" placeholder="Class"><br>
Age: <input type="number" name="age" class="sup" value="<%= s1.getAge()%>" placeholder="Age"><br>
Address: <input type="text" name="address" class="sup" value="<%= s1.getAddress()%>" placeholder="Address"><br>
Password: <input type="password" name="pass" class="sup" value="<%= s1.getPass()%>" placeholder="Password"><br>
<input type="submit" value="Update" id="sub">
</form>
</div>
</div>
</body>
</html>