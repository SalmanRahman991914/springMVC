package spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
@RequestMapping("/class")
public String home(Model model) {
	model.addAttribute("name","Salman Rahman");
	
	
	return "class";
	
}
}
