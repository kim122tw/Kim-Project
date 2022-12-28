<%@page import="java.util.List"%>
<%@page import="Dao.order.implOrder"%>
<%@page import="Model.porder"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<%
	List<porder> l = new implOrder().queryAll();
	porder[] p = l.toArray(new porder[l.size()]);
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
						<td colspan="6" align="center">
							<form action="orderDetails.jsp" method="post">
								訂單編號:<input type="text" name="orderId">
								<input type="submit">
							</form>
					<tr>
						<td colspan="6" height="30">
					<tr align="center">
						<td>訂單編號<td>名稱<td>訂單日期<td>連絡電話<td>送達地址<td>總花費
					<% for (int i = 0; i < p.length; i++) {
							out.print("<tr align=center><td>" + p[i].getOrderId() +
									  "<td>" + p[i].getCustomerName() +
									  "<td>" + p[i].getOrderDate() +
									  "<td>" + p[i].getPhone() +
									  "<td>" + p[i].getAddress() + 
									  "<td>" + p[i].getTotalPrice() + "元");
						}
					%>
					
				</table>
		<tr height="80" align="center">
			<td>
				<a href="storeSystem.jsp">回上一頁</a>	
	</table>
</body>
</html>