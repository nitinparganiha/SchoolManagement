
<%@page import="java.util.List"%>
<%@page import="schoolManagement.dto.Result"%>
<%@page import="com.mysql.cj.Query"%>
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
        padding: 10px 40px;
        color:white;
        font-weight: bolder;
        font-size: 25px;
        font-family: cursive;      
       
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
<p id="rname">Result</p>
<%
HttpSession rh=request.getSession();
List<Result> l=(List)rh.getAttribute("res");
%>

<table>
<tr>
<th class="head">Id</th>
<th class="head">Subject</th>
<th class="head">Marks</th>
<th class="head">Class</th>
<th class="head">Email</th>
</tr>
<% 
for(int i=0;i<l.size();i++){
	Result r=l.get(i);
	%>
	<tr>
	<td class="col"><%out.print(r.getId());%></td>
	<td class="col"><%out.print(r.getSubject());%></td>
	<td class="col"><%out.print(r.getMarks());%></td>
	<td class="col"><%out.print(r.getClas());%></td>
	<td class="col"><%out.print(r.getEmail());%></td>
	</tr>
	
<%
}
%>
</table>
</div>
</body>
</html>