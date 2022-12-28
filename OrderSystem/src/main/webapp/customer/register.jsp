<%@page import="Model.customer"%>
<%@page import="Dao.customer.implCustomer"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	request.setCharacterEncoding("big5");
	String username = request.getParameter("username");
	customer c = new implCustomer().queryUsername(username);
	
	if (username == "" || username == null) {
		
	} else if (c != null) {
		out.print("<script>alert('帳號重複');</script>");
	} else {
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		c = new customer(name, username, password, address, phone);
		session.setAttribute("C", c);
		response.sendRedirect("../registerController");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	form {
	font-size: 35px;
}
	input {
	font-size: 35px;
}
</style>

</head>
<body>
	<table align="center" border="1" width="600">
		<tr align="center" height="60">
			<td><h1>會員註冊</h1>
		<tr align="center" height="500">
			<td>
				<form action="register.jsp" method="post">
					帳號:<input type="text" name="username" required="required"><br>
					密碼:<input type="password" name="password" required="required"><br>
					姓名:<input type="text" name="name" required="required"><br>
					地址:<input type="text" name="address" required="required"><br>
					電話:<input type="text" name="phone" required="required"><br>
					<input type="submit" value="註冊">
				</form>
		<tr align="center" height="80">
			<td><a href="customerLogin.jsp">回首頁</a>
	</table>
</body>
</html> 