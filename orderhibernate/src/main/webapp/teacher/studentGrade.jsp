<%@page import="Dao.gradeDaoImpl"%>
<%@page import="Dao.studentDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="Model.gradeList"%>
<%@page import="Model.teacher"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	teacher t = (teacher) session.getAttribute("T");
	List<gradeList> l = new studentDaoImpl().classGrade(t.getTeacherClass());
	gradeList[] g = l.toArray(new gradeList[l.size()]);
	List<String> ls = new gradeDaoImpl().gradePass(t.getTeacherClass());
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width="640" align="center" border="1">
	<tr height="80">
		<td align="center"><h1>學生成績</h1>
	<tr height="400">
		<td align="center">
		<table width="540" align="center" border="1">
			<tr>
				<td>學號<td>名字<td>國文<td>英文<td>數學<td>體育<td>科學<td>總分<td>是否要留級
			<tr>
				<td colspan="9">
				<hr>
				<%
					for (int i = 0; i < g.length; i++) {
						out.print( "<tr align=center> <td>" + g[i].getStudentNumber() +
								   "<td>" + g[i].getStudentName() + 
								   "<td>" + g[i].getChinese() +
								   "<td>" + g[i].getEnglish() + 
								   "<td>" + g[i].getMath() + 
								   "<td>" + g[i].getPhysical() + 
								   "<td>" + g[i].getScience() + 
								   "<td>" + g[i].getTotal() +
								   "<td>" + ls.get(i)
								 );
					}
				%>
		
		</table>
	<tr height="50">
			<td align="center"><a href="teacherLoginSuccess.jsp" type="sumbit">回上一頁</a>
</table>
</body>
</html>