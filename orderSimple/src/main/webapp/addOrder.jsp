<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width="650" align="center" border="1">
	<tr height="80">
		<td align="center"><jsp:include page="title.jsp"/>
	<tr height="500">
		<td align="center">
		<form action="confirm.jsp" method="post">
			<table width=510 align="center" border="0">
				<tr>
					<td colspan="3">
					�ู
					<select name="desk">
						<option value="A��">A��
						<option value="B��">B��
						<option value="C��">C��
						<option value="D��">D��
					</select>
				<tr>
					<td colspan="3">
					<hr>
				<tr>
					<td width=170 align="center" valign="top">
					A�\<br>
					<img alt="1" src="pic/4.jpg">
					<input type="number" name="A" value="0" min="0" >
					
					<td width=170 align="center" valign="top">
					B�\<br>
					<img alt="2" src="pic/5.jpg">
					<input type="number" name="B" value="0" min="0" >
					
					<td width=170 align="center" valign="top">
					C�\<br>
					<img alt="3" src="pic/6.jpg">
					<input type="number" name="C" value="0" min="0" >
					
				<tr>
					<td colspan="3">
					<hr>
				<tr>
					<td colspan="3" align="center">
					<input type="submit" value="ok">
					<a href="index.jsp">�W�@��</a>
					
			</table>
		</form>
		
		<tr height="40">
		<td align="center"><jsp:include page="end.jsp"/>
	
</table>
</body>
</html>