<%@page import="Model.student"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	student s = (student) session.getAttribute("S");
//先在這邊判斷資料
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
			<h3><%=s.getStudentName() %> 資訊</h3><hr>
	<tr height="120">
		<td width="250">學號<td width="250"><%=s.getStudentNumber() %><td>
	<tr height="120">
		<td>名字<td><%=s.getStudentName() %><td><a href="updateStudent/updateStudentName.jsp"><input type="submit" style="padding: 25px;font-size: 25px;" value="修改"></a>
	<tr height="120">
		<td>生日<td><%=s.getStudentBirth() %><td>
	<tr height="120">
		<td>地址<td><%=s.getAddress() %><td><a href="updateStudent/updateStudentAddress.jsp"><input type="submit"style="padding: 25px;font-size: 25px;" value="修改"></a>
	<tr height="120">
		<td>電話<td><%=s.getPhone() %><td><a href="updateStudent/updateStudentPhone.jsp"><input type="submit"style="padding: 25px;font-size: 25px;" value="修改"></a>
	<tr height="120">
		<td colspan="3"><a href="studentLoginSuccess.jsp">上一頁</a>
		

</table>
</body>
</html>