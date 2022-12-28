package MainProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import MainProject.Dao.memberDao;
import MainProject.Model.member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("member")
public class memberController {
	
	@Autowired
	memberDao md;
	
	@RequestMapping("loginSuccess")
	public ModelAndView loginSuccess() {
		ModelAndView mav = new ModelAndView("loginSuccess");
		return mav;
	}
	
	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request) {
		String Username=request.getParameter("username");
		List<member> l = md.queryUsername(Username);
		
		ModelAndView mav = null;
		if(l.size()!=0)
		{
			mav = new ModelAndView("addMemberError");
		}
		else
		{
			String MemberName = request.getParameter("memberName");
			String Password = request.getParameter("password");
			String Address = request.getParameter("address");
			String Phone = request.getParameter("phone");
			
			md.add(new member(MemberName, Username, Password, Address, Phone));
			
			mav=new ModelAndView("addMemberSuccess");
		}
		
		return mav;
	}
	
	@RequestMapping("addMember")
	public ModelAndView addMember() {
		return new ModelAndView("addMember");
	}
	
	@RequestMapping("querymember")
	public ModelAndView queryAcount(HttpServletRequest request) {
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		member m = md.queryMember(Username, Password);
		ModelAndView mav = null;
		if (m != null) {
			mav = new ModelAndView("loginSuccess");
			mav.addObject("M",m);
			HttpSession session = request.getSession();
			session.setAttribute("SM", m);
		} else {
			mav = new ModelAndView("loginError");
		}
		return mav;
	}
	
	
}
