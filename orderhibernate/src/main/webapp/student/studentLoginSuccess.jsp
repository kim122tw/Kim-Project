<%@page import="Model.student"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	student s = (student) session.getAttribute("S");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><%= s.getStudentName() %>學生，歡迎你</h1><hr>
<table width="500" align="center" border="1">
	<tr height="400">
		<td align="center" valign="top">
			<h2><a href="updateStudent.jsp">1)<%= s.getStudentName() %> 學生資料修改</a></h2>
			
</table>
</body>
</html>