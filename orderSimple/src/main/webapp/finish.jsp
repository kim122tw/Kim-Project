<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Order"
    import="Dao.orderDaoimpl"%>
<%
Order o = (Order) session.getAttribute("O");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>

</head>
<body>
<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="title.jsp"/>
	<tr height=500>
		<td align=center>
	
		
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>訂單完成</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>桌號
				<td align=center><%=o.getDesk() %>
			<tr>
				<td width=100 align=center>A餐
				<td align=center><%=o.getA() %>
			<tr>
				<td width=100 align=center>B餐
				<td align=center><%=o.getB() %>
			<tr>
				<td width=100 align=center>C餐
				<td align=center><%=o.getC() %>
			<tr>
				<td width=100 align=center>共
				<td align=center><%=o.getSum() %>元
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<DIV ALIGN="CENTER">
					<FORM>
						<INPUT NAME="print" TYPE="button" VALUE="列印此頁" ONCLICK="varitext()">
					</FORM>
				</DIV>				
				
				
				<a href="index.jsp">回首頁</a>
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>

</table>
</body>
</html>