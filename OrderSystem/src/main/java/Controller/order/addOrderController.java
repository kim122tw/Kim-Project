package Controller.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.book.implBook;
import Dao.order.implOrder;
import Dao.orderDetails.implOrderDetails;
import Model.book;
import Model.porder;
import Model.orderDetails;

public class addOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public addOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		HttpSession session = request.getSession();
		porder o = (porder) session.getAttribute("O");
		orderDetails orderchi = (orderDetails) session.getAttribute("chi");
		orderDetails ordereng = (orderDetails) session.getAttribute("eng");
		orderDetails orderjava = (orderDetails) session.getAttribute("java");
		orderDetails ordersci = (orderDetails) session.getAttribute("sci");
		
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		o.setAddress(address);
		o.setPhone(phone);
		new implOrder().add(o);
		if (orderchi.getBookQuantity() != 0) {
			new implOrderDetails().add(orderchi);
			book chibook = new implBook().query(orderchi.getBookName());
			chibook.setBookInventory(chibook.getBookInventory() - orderchi.getBookQuantity()) ;
			new implBook().updateInventory(chibook);
		}
		if (ordereng.getBookQuantity() != 0) {
			new implOrderDetails().add(ordereng);
			book engbook = new implBook().query(ordereng.getBookName());
			engbook.setBookInventory(engbook.getBookInventory() - ordereng.getBookQuantity()) ;
			new implBook().updateInventory(engbook);
		}
		if (orderjava.getBookQuantity() != 0) {
			new implOrderDetails().add(orderjava);
			book javabook = new implBook().query(orderjava.getBookName());
			javabook.setBookInventory(javabook.getBookInventory() - orderjava.getBookQuantity()) ;
			new implBook().updateInventory(javabook);
		}
		if (ordersci.getBookQuantity() != 0) {
			new implOrderDetails().add(ordersci);
			book scibook = new implBook().query(ordersci.getBookName());
			scibook.setBookInventory(scibook.getBookInventory() - ordereng.getBookQuantity()) ;
			new implBook().updateInventory(scibook);
		}
		
		response.sendRedirect("order/orderEnd.jsp");
		
	}

}
