<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.orderDaoimpl"
    import="java.util.List"
    import="Model.Order"%>
<%
List<Object> l;
String Start = request.getParameter("start");
String End = request.getParameter("end");
if (Start == null || Start == "" || End == null || End == ""){
	l = new orderDaoimpl().queryall();
} else {
	int S = Integer.parseInt(Start);
	int E = Integer.parseInt(End);
	l = new orderDaoimpl().querysum(S, E);
}

Order[] o = l.toArray(new Order[l.size()]);//Porder p = new Porder[l.size()];
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
		<table width=500 align=center border=0>
			<tr>
				<td colspan=6 align=center>
				<form action="" method="post">
					���B 
					�q<input type="text" name="start" size=5>
					��<input type="text" name="end" size=5>
					<input type="submit" value="ok">
				</form>
			<tr>
				<td colspan=6>
				<hr>
			<tr align=center>
				<td>Id<td>�ู<td>A<td>B<td>C<td>sum
				
			<tr>
				<td colspan=6>
				<hr>
			<%
			for (int i = 0; i < o.length; i++) {
				out.print("<tr align=center ><td>" + o[i].getId() 
						 +"<td>" + o[i].getDesk()
						 +"<td>" + o[i].getA()
						 +"<td>" + o[i].getB()
						 +"<td>" + o[i].getC()
						 +"<td>" + o[i].getSum());
			}
			
			%>	
			<tr>
				<td colspan=6>
				<hr>
			<tr>
				<td colspan=6 align=center>
				<a href="index.jsp">����</a>
				
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>

</table>
</body>
</html>