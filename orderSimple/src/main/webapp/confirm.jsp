<%@page import="Model.Order"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Order"%>
<%
request.setCharacterEncoding("big5");

String Desk = request.getParameter("desk");
int A = Integer.parseInt(request.getParameter("A"));
int B = Integer.parseInt(request.getParameter("B"));
int C = Integer.parseInt(request.getParameter("C"));

Order o = new Order(Desk, A, B, C);

session.setAttribute("O", o);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="title.jsp"/>
	<tr height=500>
		<td align=center>
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>訂單細目</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>桌號
				<td><%=o.getDesk() %>
			<tr>
				<td width=100 align=center>A餐
				<td><%=o.getA() %>
			<tr>
				<td width=100 align=center>B餐
				<td><%=o.getB() %>
			<tr>
				<td width=100 align=center>C餐
				<td><%=o.getC() %>
			<tr>
				<td width=100 align=center>總金額
				<td>共<%=o.getSum() %>元
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<a href="addController">確定送出</a>
				<a href="addOrder.jsp">重新輸入</a>
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>
		

</table>
</body>
</html>