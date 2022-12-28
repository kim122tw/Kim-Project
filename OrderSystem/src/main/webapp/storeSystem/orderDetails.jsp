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
		out.print("<script>alert('訂單編號不存在');location.href='customerOrder.jsp';</script>");
		
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
				<h1>書本庫存</h1>
		<tr height="400" align="center">
			<td>
				<table border="1" width="580" >
					<tr>
						<td colspan="5" height="30">
					<tr align="center">
						<td>訂單編號<td>書籍編號<td>書名<td>數量<td>個別花費
					<% for (orderDetails o : l) {
							out.print("<tr align=center><td>" + o.getOrderDetailsId() +
									  "<td>" + o.getBookId() +
									  "<td>" + o.getBookName() +
									  "<td>" + o.getBookQuantity() +
									  "<td>" + o.getBookPrice() + "元");
						}
					%>
					
				</table>
		<tr height="80" align="center">
			<td>
				<a href="customerOrder.jsp">回上一頁</a>	
	</table>
</body>
</html>