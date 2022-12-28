package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.orderDaoimpl;


public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public deleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int Id = Integer.parseInt(request.getParameter("id"));
    	new orderDaoimpl().delete(Id);
    	response.sendRedirect("delete.jsp");
	}

}
