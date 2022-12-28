<%@page import="Model.customer"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	customer c = (customer) session.getAttribute("C");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	p {
	font-size: 30px;
	text-align: center;
	
	
}
</style>
</head>
<body>
	<table align="center" border="1" width="650">
		<tr align="center" height="80">
			<td><h1><%=c.getCustomerName() %>你好，請問今天需要甚麼服務</h1>
		<tr align="center" height="600">
			<td>
				<a href="../order/addOrder.jsp"><p>訂購書籍</p></a><br>
				<a href="../order/queryOrder.jsp"><p>查詢交易紀錄</p></a>
				
	</table>
</body>
</html>