<%@page import="Dao.studentDaoImpl"%>
<%@page import="Model.student"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	student s = new studentDaoImpl().queryStudent(username, password);
	session = request.getSession();
	if (username == "" || username == null) {
	
	} else if (s != null) {
		session.setAttribute("S", s);
		response.sendRedirect("studentLoginSuccess.jsp");
	} else {
		response.sendRedirect("studentLoginError.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
p {
	color: blue;
	font-size: 18px;
	text-align: center;
	
}
</style>
</head>
<body>
<h1 align="center">學生登入介面</h1><hr>
<form action="studentLogin.jsp" method="post" align="center">
<font size="5">帳號:</font><input type="text" name="username" ><br>
<font size="5">密碼:</font><input type="password" name="password"><br><br>
<input type="submit" value="提交"><h4>初登入密碼設為生日,例如:1995/04/03，密碼為0403</h4>

</form>
<p>兆欣製作</p>

</body>
</html>