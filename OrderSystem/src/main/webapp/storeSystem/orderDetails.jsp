<%@page import="java.util.ArrayList"%>
<%@page import="Dao.orderDetails.implOrderDetails"%>
<%@page import="Model.orderDetails"%>
<%@page import="java.util.List"%>
<%@page import="Dao.order.implOrder"%>
<%@page import="Model.porder"%>
<%@page import="Dao.order.orderDao"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<%
	String id = request.getParameter("orderId");
	porder p = new implOrder().queryId(id);
	List<orderDetails> l = new ArrayList<>();
	if (p == null) {
		out.print("<script>alert('�q��s�����s�b');location.href='customerOrder.jsp';</script>");
		
	} else {
		l = new implOrderDetails().queryId(p.getOrderDetailsId());
	}
	 
	
%>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1" width="650">
		<tr height="80" align="center">
			<td>
				<h1>�ѥ��w�s</h1>
		<tr height="400" align="center">
			<td>
				<table border="1" width="580" >
					<tr>
						<td colspan="5" height="30">
					<tr align="center">
						<td>�q��s��<td>���y�s��<td>�ѦW<td>�ƶq<td>�ӧO��O
					<% for (orderDetails o : l) {
							out.print("<tr align=center><td>" + o.getOrderDetailsId() +
									  "<td>" + o.getBookId() +
									  "<td>" + o.getBookName() +
									  "<td>" + o.getBookQuantity() +
									  "<td>" + o.getBookPrice() + "��");
						}
					%>
					
				</table>
		<tr height="80" align="center">
			<td>
				<a href="customerOrder.jsp">�^�W�@��</a>	
	</table>
</body>
</html>