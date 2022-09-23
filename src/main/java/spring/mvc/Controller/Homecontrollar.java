package spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontrollar {
	@RequestMapping("/index")
public String home() {
	System.out.println("this is url page");
	return "index";
}
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("this is 2nd url");
		model.addAttribute("name","Salman Rahman");
		return "about";
		
	}
}
