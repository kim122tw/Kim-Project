<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porder.porderDao"
    import="java.util.List"
    import="Model.porder"%>
    
 <%
 //String show1=new porderDao().queryAll1() ;
// List<porder> l=new porderDao().queryAll2();
 //List<porder> l=new porderDao().querySum(1600, 2200);
 /*
 1.request-->�����P�_-->null ,""
 2.��--->l=querySum
 3.null,""-->l=queryAll2
 
 */
/* String Start=request.getParameter("start");
 String End=request.getParameter("end");
 List<porder> l=null;
 if(Start!=null && Start!="" && End!=null && End!="")
 {
	int S=Integer.parseInt(Start);
	int E=Integer.parseInt(End);
	
	l=new porderDao().querySum(S, E);
 }
 else
 {
	 l=new porderDao().queryAll2();
 }*/
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=450>
			<td >
			<form action="query.jsp">
				<table width=500 align=center border=1>
					<tr>
						<td>�q����
					<tr>
						<td>
						��J���B:
						�q<input type="text" name="start" size=5>��<input type="text" name="end" size=5>
						<input type="submit" value="�T�w">					
						
				</table>
			</form>
			<hr>
			<table width=500 align=center border=1>
			<tr>
				<td>ID<td>�ู<td>A�\<td>B�\<td>C�\<td>���B
			<%
				/*for(porder p:l)
				{
					out.println("<tr><td>"+p.getId()+
							"<td>"+p.getDesk()+
							"<td>"+p.getA()+
							"<td>"+p.getB()+
							"<td>"+p.getC()+
							"<td>"+p.getSum());
				}*/
			
			
			%>
			<tr>
				<td colspan=6 align=center>
				<a href="index.jsp">�^����</a>
			</table>
			
			
			
			
			
		<tr height=50>
			<td align=center><jsp:include page="../footer.jsp"/>
	
	</table>

</body>
</html>