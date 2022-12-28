package Controller.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.customer.implCustomer;
import Model.customer;

public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	request.setCharacterEncoding("big5");
    	HttpSession session = request.getSession();
    	
    	customer c =  (customer) session.getAttribute("C");
    	new implCustomer().add(c);
    	response.setContentType("text/html; charset=BIG5");
    	PrintWriter out = response.getWriter();
    	out.print("<script language='javascript'>alert('註冊成功');window.location.href='customer/customerLogin.jsp';</script>");
    	//response.sendRedirect("customer/customerLogin.jsp");
    	  
	}

}
