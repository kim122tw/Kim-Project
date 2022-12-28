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
				<h1>書本庫存</h1>
		<tr height="400" align="center">
			<td>
				<table border="1" width="500" >
					<tr align="center">
						<td>書號<td>書名<td>價格<td>庫存量
					<% for (book b : l) {
							out.print("<tr align=center><td>" + b.getBookId() +
									  "<td>" + b.getBookName() +
									  "<td width=120>" + b.getBookPrice() + "元" +
									  "<td>" + b.getBookInventory() + "個");
						}
					%>
				</table>
		<tr height="80" align="center">
			<td>
				<a href="storeSystem.jsp">回上一頁</a>	
	</table>
</body>
</html>