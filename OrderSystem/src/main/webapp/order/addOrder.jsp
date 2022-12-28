<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	a {
	font-size: 35px;
}
input[type=submit] {
	width: 80px;
	height: 40px;
	font-size: 15px;
}
</style>
</head>
<body>
	<table align="center" border="1" width="650">
		<tr align="center" height="80">
			<td><h1>買書系統</h1>
		<tr align="center" height="500">
			<td align="center">
				<form action="confirm.jsp" method="post">
					<table align="center" width="580">
					<tr>
						<td align="center" valign="top">
							<img alt="國語字典" src="../pic/001.jpg" width="100"><br>
							國語字典<br>
							<input type="number" min="0" name="國語字典" value="0">
						<td align="center" valign="top">
							<img alt="英文小說" src="../pic/002.jpg" width="100"><br>
							英文小說<br>
							<input type="number" min="0" name="英文小說" value="0">
					<tr>
						<td align="center" valign="top">
							<img alt="java" src="../pic/003.jpg" width="100"><br>
							java8<br>
							<input type="number" min="0" name="java8" value="0">
						<td align="center" valign="top">
							<img alt="科學雜誌" src="../pic/004.jpg" width="100"><br>
							科學雜誌<br>
							<input type="number" min="0" name="科學雜誌" value="0">
					<tr>
						<td align="right" colspan="2" valign="bottom" height="70">
							<input type="submit" value="確定購買" ></td>
					</table>
				</form> 
		<tr>
			<td align="center">
			<a href="../customer/customerLoginSuccess.jsp">回首頁</a>
		
				
	</table>
</body>
</html>