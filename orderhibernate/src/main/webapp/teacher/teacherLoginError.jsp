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
<h1 align="center">老師登入介面</h1><hr>
<form action="teacherLogin.jsp" method="post" align="center">
<font size="5">帳號:</font><input type="text" name="username" ><br>
<font size="5">密碼:</font><input type="password" name="password"><br><br>
<input type="submit" value="提交">
<p>帳號或密碼錯誤,請重新輸入</p>
</form>
<p>兆欣製作</p>
</body>
</html>