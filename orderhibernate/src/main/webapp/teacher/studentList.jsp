<%@page import="Dao.studentDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="Model.teacher"%>
<%@page import="Model.student"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
	teacher t = (teacher) session.getAttribute("T");
	List<student> l = new studentDaoImpl().classInformation(t.getTeacherClass());
	student[] s = l.toArray(new student[l.size()]); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width="500" align="center" border="1">
	<tr height="80">
		<td align="center"><h1>�ǥ͸��</h1>
	<tr height="400">
		<td align="center">
		<table width="450" align="center" border="1">
			<tr>
				<td>�Ǹ�<td>�W�r<td>�ͤ���<td>�a�}<td>�q��<td>�ժ����
			<tr>
				<td colspan="6">
				<hr>
				<%
					for (int i = 0; i < s.length; i++) {
						out.print( "<tr align=center> <td>" + s[i].getStudentNumber() +
								   "<td>" + s[i].getStudentName() + 
								   "<td>" + s[i].getStudentBirth() +
								   "<td>" + s[i].getAddress() + 
								   "<td>" + s[i].getPhone() + 
								   "<td>" + s[i].getBestSubject()
								 );
					}
				%>
		
				
		</table>
	<tr height="50">
			<td align="center"><a href="teacherLoginSuccess.jsp" type="sumbit">�^�W�@��</a>	

</table>
</body>
</html>