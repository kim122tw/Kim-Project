package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.orderDaoimpl;
import Model.Order;


public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	Order o = (Order) session.getAttribute("O");
    	
    	new orderDaoimpl().add(o);
    	
    	response.sendRedirect("finish.jsp");
	}

}
