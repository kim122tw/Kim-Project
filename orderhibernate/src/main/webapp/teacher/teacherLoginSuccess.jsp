<%@page import="Model.teacher"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	teacher t = (teacher) session.getAttribute("T");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><%= t.getTeacherName() %>�Ѯv�A�w��A</h1><hr>
<table width="500" align="center" border="1">
	<tr height="400">
		<td align="center" valign="top">
			<h2><a href="studentList.jsp">1)<%= t.getTeacherClass() %> �ǥͪ��p</a></h2>
			<h2><a href="studentGrade.jsp">2)<%= t.getTeacherClass() %> �ǥͦ��Z</a></h2>
			<h2><a href="studentBirth.jsp">3)�جP�ͤ�ɶ�</a></h2>
</table>
</body>
</html>