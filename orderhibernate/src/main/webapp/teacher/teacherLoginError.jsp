<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="javax.swing.JOptionPane"
    import="Dao.teacherDaoImpl"
    import="Model.teacher"%>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
teacher t = new teacherDaoImpl().queryTeacher(username, password);
if (username == "" || username == null) {
	
} else if (t != null) {
	response.sendRedirect("teacherLoginSuccess.jsp");
} else {
	
	response.sendRedirect("teacherLoginError.jsp");
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
<h1 align="center">�Ѯv�n�J����</h1><hr>
<form action="teacherLogin.jsp" method="post" align="center">
<font size="5">�b��:</font><input type="text" name="username" ><br>
<font size="5">�K�X:</font><input type="password" name="password"><br><br>
<input type="submit" value="����">
<p>�b���αK�X���~,�Э��s��J</p>
</form>
<p>���Y�s�@</p>
</body>
</html>