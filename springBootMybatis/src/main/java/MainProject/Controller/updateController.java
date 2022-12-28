package MainProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("update")
public class updateController {
	
	@RequestMapping("toUpdate")
	public ModelAndView update(HttpServletRequest request) {
		ModelAndView mav = null;
		String Name = request.getParameter("name");
		String Password = request.getParameter("password");
		String Address = request.getParameter("address");
		String Phone = request.getParameter("phone");
		
		if (Name != null) {
			mav = new ModelAndView("update/updateName");
		} else if (Password != null) {
			mav = new ModelAndView("update/updatePassword");
		} else if (Address != null) {
			mav = new ModelAndView("update/updateAddress");
		} else if (Phone != null) {
			mav = new ModelAndView("update/updatePhone");
		} 
		return mav;
	}
}
