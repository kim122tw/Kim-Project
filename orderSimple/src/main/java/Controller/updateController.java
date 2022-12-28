package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.orderDaoimpl;
import Model.Order;


public class updateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public updateController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setCharacterEncoding("big5");
    	String Id = request.getParameter("id");
    	String Desk = request.getParameter("desk");
    	int ID = Integer.parseInt(Id);
    	
    	List<Object> l = new orderDaoimpl().queryId(ID);
    	Order[] o = l.toArray(new Order[l.size()]);
    	
    	o[0].setDesk(Desk);
    	
    	new orderDaoimpl().update(o[0]);
    	
    	response.sendRedirect("update.jsp");
    	
    	
    }

}
