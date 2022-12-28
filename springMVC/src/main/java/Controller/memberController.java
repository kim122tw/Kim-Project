package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Dao.member.implMember;
import Factory.Style2;
import Model.member;

@RestController
@RequestMapping("member")
public class memberController {
	
	private static ApplicationContext a = new ClassPathXmlApplicationContext("style2.xml");
	private Style2 st2 = a.getBean("STYLE2", Style2.class);
	
	//切換登入頁Login.jsp
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("member/login");
		return mav;
	}
	
	
	@RequestMapping("memberLogin")
	public ModelAndView memberLogin(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		member m = new implMember().queryMember(username, password);
		if (m != null) {
			ModelAndView mav = new ModelAndView("porder/addOrder");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("../");
			return mav;
		}
		
	}
	
}
