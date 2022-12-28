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
	int chi = Integer.parseInt(request.getParameter("國語字典")); 
	int eng = Integer.parseInt(request.getParameter("英文小說"));
	int java = Integer.parseInt(request.getParameter("java8"));
	int sci = Integer.parseInt(request.getParameter("科學雜誌"));
	int chiPrice = new implBook().query("國語字典").getBookPrice();
	int engPrice = new implBook().query("英文小說").getBookPrice();
	int javaPrice = new implBook().query("java8").getBookPrice();
	int sciPrice = new implBook().query("科學雜誌").getBookPrice();
	
	if (new implBook().query("國語字典").getBookInventory() < chi) {
		out.print("<script>alert('國文字典庫存不足');location.href='addOrder.jsp';</script>");
		
	} else if (new implBook().query("英文小說").getBookInventory() < eng) {
		out.print("<script>alert('英文小說庫存不足');location.href='addOrder.jsp';</script>");
		
		
	} else if (new implBook().query("java8").getBookInventory() < java) {
		out.print("<script>alert('java8庫存不足');location.href='addOrder.jsp';</script>");
		
	} else if (new implBook().query("科學雜誌").getBookInventory() < chi) {
		out.print("<script>alert('科學雜誌庫存不足');location.href='addOrder.jsp';</script>");
		
	} else {
		
	}
	customer c = (customer) session.getAttribute("C");
	porder o = new porder(c.getCustomerName(), new Date(), null, null, chiPrice + engPrice + javaPrice + sciPrice);
	
	orderDetails orderchi = new orderDetails(o.getOrderDetailsId(), "A0009", "國語字典", chi, chi*chiPrice);
	orderDetails ordereng = new orderDetails(o.getOrderDetailsId(), "D0013", "英文小說", eng, eng*engPrice);
	orderDetails orderjava = new orderDetails(o.getOrderDetailsId(), "C0012", "java8", java, java*javaPrice);
	orderDetails ordersci = new orderDetails(o.getOrderDetailsId(), "B0037", "科學雜誌", sci, sci*sciPrice);
	
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
				<h1>購買確認</h1>
		<tr>
			<td align="center">
				<p>國語字典: <%=chi %>本, <%=chi * chiPrice %>元</p>
				<p>英文小說: <%=eng %>本, <%=eng * engPrice %>元</p>
				<p>java8 : <%=java %>本, <%=java * javaPrice %>元</p>
				<p>科學雜誌: <%=sci %>本, <%=sci * sciPrice %>元</p>
				<pre>                 總共<%=chi*chiPrice + eng*engPrice + java*javaPrice + sci*sciPrice %>元</pre>
				<form action="../addOrderController" method="post">
					寄貨住址<input type="text" required="required" name="address"><br>
					連絡電話<input type="text" required="required" name="phone">
					<input type="submit" value="再次確認">
				</form>
				
				<a href="addOrder.jsp">重新購入</a>
				
				
	</table>
</body>
</html>