<%@page import="Model.book"%>
<%@page import="Dao.book.implBook"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<%
	List<book> l = new implBook().query();
	
%>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	td {
	font-size: 28px;
}
</style>
</head>
<body>
	<table align="center" border="1" width="650">
		<tr height="80" align="center">
			<td>
				<h1>�ѥ��w�s</h1>
		<tr height="400" align="center">
			<td>
				<table border="1" width="500" >
					<tr align="center">
						<td>�Ѹ�<td>�ѦW<td>����<td>�w�s�q
					<% for (book b : l) {
							out.print("<tr align=center><td>" + b.getBookId() +
									  "<td>" + b.getBookName() +
									  "<td width=120>" + b.getBookPrice() + "��" +
									  "<td>" + b.getBookInventory() + "��");
						}
					%>
				</table>
		<tr height="80" align="center">
			<td>
				<a href="storeSystem.jsp">�^�W�@��</a>	
	</table>
</body>
</html>