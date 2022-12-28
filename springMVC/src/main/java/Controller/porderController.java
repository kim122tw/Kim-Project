package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Dao.porder.implPorder;
import Model.porder;

@RestController
@RequestMapping("porder")
public class porderController {

	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request) {
		HttpSession session = request.getSession();
		porder p = (porder) session.getAttribute("P");
		new implPorder().add(p);
		
		ModelAndView modelandview=new ModelAndView("porder/finish");
		return modelandview;
	}


	@RequestMapping("confirm")
	public ModelAndView confirm() {
		ModelAndView modelandview=new ModelAndView("porder/confirm");
		return modelandview;
	}

	@GetMapping("getTest")
	public String getTest() {
		return "GET";
	}
	
	@PostMapping("test1")
	public String test1(String name,String password) {
		return "name:"+ name + ", pasword:" + password;
	}
	
	@PostMapping("test2")
	public String test2(HttpServletRequest request) {
		
		String x = request.getParameter("name");
		String y = request.getParameter("password");
		
		return "name:"+ x +", pasword:"+ y;
	}
	
	@RequestMapping("test3/{name}/{password}")
	public String test3(@PathVariable String name, @PathVariable String password) {
		
		return "name:"+ name + ", pasword:" + password;
	}
	
	@RequestMapping("test4")
	public String test4(@RequestParam String name, @RequestParam String password) {
		
		return "name:"+ name + ", pasword:" + password;
	}
	
	@RequestMapping("test5")
	@ResponseBody // 當在Controller才有差別，擺在testController效果一樣
	public List<porder> getTest5(){
		List<porder> l=new ArrayList();
		
		
		
		return l;
	}
}