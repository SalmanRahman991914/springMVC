package spring.mvc.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mdel {
	 @RequestMapping("/page")
public String name(Model model) {
		 System.out.println("this is first page");
		 model.addAttribute("name","Mohammad Salman");
		 model.addAttribute("id",3453);
		 
	return "page";
	 }
}

