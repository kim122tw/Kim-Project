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
			<td><h1><%=c.getCustomerName() %>�A�n�A�аݤ��ѻݭn�ƻ�A��</h1>
		<tr align="center" height="600">
			<td>
				<a href="../order/addOrder.jsp"><p>�q�ʮ��y</p></a><br>
				<a href="../order/queryOrder.jsp"><p>�d�ߥ������</p></a>
				
	</table>
</body>
</html>