package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Factory.Style1;
import Model.member;

public class testController {
	
	private static ApplicationContext a1 = new ClassPathXmlApplicationContext("style1.xml");
	static Style1 st1 = a1.getBean("STYLE1", Style1.class);

	public static void main(String[] args) {
		member m = new member("ki", "haha", "123");
		st1.getMD().add(m);

	}

}
