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
<h1 align="center">�ǥ͵n�J����</h1><hr>
<form action="studentLogin.jsp" method="post" align="center">
<font size="5">�b��:</font><input type="text" name="username" ><br>
<font size="5">�K�X:</font><input type="password" name="password"><br><br>
<input type="submit" value="����"><h4>��n�J�K�X�]���ͤ�,�Ҧp:1995/04/03�A�K�X��0403</h4>

</form>
<p>���Y�s�@</p>

</body>
</html>