package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.studentDaoImpl;
import Model.student;


public class updateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public updateStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
    	HttpSession session = request.getSession();
    	student s = (student) session.getAttribute("S");
    	String studentName = null;
    	String studentAddress = null;
    	String studentPhone = null;
    	
    	studentAddress = request.getParameter("studentAddress");
    	studentName = request.getParameter("studentName");
    	studentPhone = request.getParameter("studentPhone");
    	
    	if (studentName != null) {
    		s.setStudentName(studentName);
    		new studentDaoImpl().update(s);
    		response.sendRedirect("student/updateStudent.jsp");
    	} else if (studentAddress != null) {
    		s.setAddress(studentAddress);
    		new studentDaoImpl().update(s);
    		response.sendRedirect("student/updateStudent.jsp");
    	} else if (studentPhone != null) {
    		s.setPhone(studentPhone);
    		new studentDaoImpl().update(s);
    		response.sendRedirect("student/updateStudent.jsp");
		} else {
			response.sendRedirect("student/updateStudent.jsp");
		}
	}

}
