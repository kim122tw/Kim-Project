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
				<td colspan=2 align=center><h3>�q��ӥ�</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>�ู
				<td><%=o.getDesk() %>
			<tr>
				<td width=100 align=center>A�\
				<td><%=o.getA() %>
			<tr>
				<td width=100 align=center>B�\
				<td><%=o.getB() %>
			<tr>
				<td width=100 align=center>C�\
				<td><%=o.getC() %>
			<tr>
				<td width=100 align=center>�`���B
				<td>�@<%=o.getSum() %>��
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<a href="addController">�T�w�e�X</a>
				<a href="addOrder.jsp">���s��J</a>
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>
		

</table>
</body>
</html>