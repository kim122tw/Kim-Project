<%@page import="Model.student"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	student s = (student) session.getAttribute("S");
//���b�o��P�_���
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	td {
	text-align: center;
	font-size: 50px;
}
</style>
</head>
<body>
<table width="750" align="center" border="1">
	<tr align="center">
		<td colspan="3">
			<h3><%=s.getStudentName() %> ��T</h3><hr>
	<tr height="120">
		<td width="250">�Ǹ�<td width="250"><%=s.getStudentNumber() %><td>
	<tr height="120">
		<td>�W�r<td><%=s.getStudentName() %><td><a href="updateStudent/updateStudentName.jsp"><input type="submit" style="padding: 25px;font-size: 25px;" value="�ק�"></a>
	<tr height="120">
		<td>�ͤ�<td><%=s.getStudentBirth() %><td>
	<tr height="120">
		<td>�a�}<td><%=s.getAddress() %><td><a href="updateStudent/updateStudentAddress.jsp"><input type="submit"style="padding: 25px;font-size: 25px;" value="�ק�"></a>
	<tr height="120">
		<td>�q��<td><%=s.getPhone() %><td><a href="updateStudent/updateStudentPhone.jsp"><input type="submit"style="padding: 25px;font-size: 25px;" value="�ק�"></a>
	<tr height="120">
		<td colspan="3"><a href="studentLoginSuccess.jsp">�W�@��</a>
		

</table>
</body>
</html>