<%@page import="Dao.customer.implCustomer"%>
<%@page import="Model.customer"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	customer c = new implCustomer().queryCustomer(username, password);
	if (username == "" || username == null) {
		
	} else if (c != null) {
		session.setAttribute("C", c);
		response.sendRedirect("customerLoginSuccess.jsp");
	} else {
		response.sendRedirect("customerLoginError.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	p {
	font-size: 30px;
}
</style>

</head>
<body>
	<table width="600" align="center" border="1">
		<tr align="center" height="60">
			<td>
				<h1>顧客登入系統</h1>
		<tr align="center" height="480">
			<td>
				<form action="customerLogin.jsp" method="post">
					<p>帳號:<input type="text" name="username" style="font-size: 30px;" required="required" value=""></p>
					<p>密碼:<input type="password" name="password" style="font-size: 30px;" required="required" value=""></p>
					<input type="submit">
				</form>
		<tr align="center" height="80">
			<td>
				<a href="register.jsp">註冊</a>
				
	</table>
</body>
</html>