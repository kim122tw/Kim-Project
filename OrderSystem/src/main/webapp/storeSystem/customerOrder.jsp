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
				<h1>�ѥ��w�s</h1>
		<tr height="400" align="center">
			<td>
				<table border="1" width="580" >
					<tr>
						<td colspan="6" align="center">
							<form action="orderDetails.jsp" method="post">
								�q��s��:<input type="text" name="orderId">
								<input type="submit">
							</form>
					<tr>
						<td colspan="6" height="30">
					<tr align="center">
						<td>�q��s��<td>�W��<td>�q����<td>�s���q��<td>�e�F�a�}<td>�`��O
					<% for (int i = 0; i < p.length; i++) {
							out.print("<tr align=center><td>" + p[i].getOrderId() +
									  "<td>" + p[i].getCustomerName() +
									  "<td>" + p[i].getOrderDate() +
									  "<td>" + p[i].getPhone() +
									  "<td>" + p[i].getAddress() + 
									  "<td>" + p[i].getTotalPrice() + "��");
						}
					%>
					
				</table>
		<tr height="80" align="center">
			<td>
				<a href="storeSystem.jsp">�^�W�@��</a>	
	</table>
</body>
</html>