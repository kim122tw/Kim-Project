<%@page import="Model.orderDetails"%>
<%@page import="java.util.Date"%>
<%@page import="Model.porder"%>
<%@page import="Model.customer"%>
<%@page import="Dao.book.implBook"%>
<%@page import="Model.book"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<%


	request.setCharacterEncoding("big5");
	int chi = Integer.parseInt(request.getParameter("��y�r��")); 
	int eng = Integer.parseInt(request.getParameter("�^��p��"));
	int java = Integer.parseInt(request.getParameter("java8"));
	int sci = Integer.parseInt(request.getParameter("������x"));
	int chiPrice = new implBook().query("��y�r��").getBookPrice();
	int engPrice = new implBook().query("�^��p��").getBookPrice();
	int javaPrice = new implBook().query("java8").getBookPrice();
	int sciPrice = new implBook().query("������x").getBookPrice();
	
	if (new implBook().query("��y�r��").getBookInventory() < chi) {
		out.print("<script>alert('���r��w�s����');location.href='addOrder.jsp';</script>");
		
	} else if (new implBook().query("�^��p��").getBookInventory() < eng) {
		out.print("<script>alert('�^��p���w�s����');location.href='addOrder.jsp';</script>");
		
		
	} else if (new implBook().query("java8").getBookInventory() < java) {
		out.print("<script>alert('java8�w�s����');location.href='addOrder.jsp';</script>");
		
	} else if (new implBook().query("������x").getBookInventory() < chi) {
		out.print("<script>alert('������x�w�s����');location.href='addOrder.jsp';</script>");
		
	} else {
		
	}
	customer c = (customer) session.getAttribute("C");
	porder o = new porder(c.getCustomerName(), new Date(), null, null, chiPrice + engPrice + javaPrice + sciPrice);
	
	orderDetails orderchi = new orderDetails(o.getOrderDetailsId(), "A0009", "��y�r��", chi, chi*chiPrice);
	orderDetails ordereng = new orderDetails(o.getOrderDetailsId(), "D0013", "�^��p��", eng, eng*engPrice);
	orderDetails orderjava = new orderDetails(o.getOrderDetailsId(), "C0012", "java8", java, java*javaPrice);
	orderDetails ordersci = new orderDetails(o.getOrderDetailsId(), "B0037", "������x", sci, sci*sciPrice);
	
	session.setAttribute("O", o);
	session.setAttribute("chi", orderchi);
	session.setAttribute("eng", ordereng);
	session.setAttribute("java", orderjava);
	session.setAttribute("sci", ordersci);
%>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
	p {
	font-size: 30px;
}
  pre {
	font-size: 30px;
}
 form {
	font-size: 35px;
}
input {
	font-size: 35px;
}
</style>
</head>
<body>
	<table align="center" border="1" width="650">
		<tr align="center" height="80">
			<td>
				<h1>�ʶR�T�{</h1>
		<tr>
			<td align="center">
				<p>��y�r��: <%=chi %>��, <%=chi * chiPrice %>��</p>
				<p>�^��p��: <%=eng %>��, <%=eng * engPrice %>��</p>
				<p>java8 : <%=java %>��, <%=java * javaPrice %>��</p>
				<p>������x: <%=sci %>��, <%=sci * sciPrice %>��</p>
				<pre>                 �`�@<%=chi*chiPrice + eng*engPrice + java*javaPrice + sci*sciPrice %>��</pre>
				<form action="../addOrderController" method="post">
					�H�f��}<input type="text" required="required" name="address"><br>
					�s���q��<input type="text" required="required" name="phone">
					<input type="submit" value="�A���T�{">
				</form>
				
				<a href="addOrder.jsp">���s�ʤJ</a>
				
				
	</table>
</body>
</html>