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
		out.print("<script>alert('�b������');</script>");
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
			<td><h1>�|�����U</h1>
		<tr align="center" height="500">
			<td>
				<form action="register.jsp" method="post">
					�b��:<input type="text" name="username" required="required"><br>
					�K�X:<input type="password" name="password" required="required"><br>
					�m�W:<input type="text" name="name" required="required"><br>
					�a�}:<input type="text" name="address" required="required"><br>
					�q��:<input type="text" name="phone" required="required"><br>
					<input type="submit" value="���U">
				</form>
		<tr align="center" height="80">
			<td><a href="customerLogin.jsp">�^����</a>
	</table>
</body>
</html> 