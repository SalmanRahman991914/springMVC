package spring.mvc.Controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("contact")
public String contact() {
	return "contact";
	
}
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String handleForm(
	        @RequestParam("id")String id,
			@RequestParam("name")String name,
			@RequestParam("address")String address,
			@RequestParam("email") String email,Model model){
		
		System.out.println("your id is "+id);
		System.out.println("your name is "+name);
		System.out.println("your address is "+address);
		System.out.println("your email is "+email);
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		model.addAttribute("address",address);
		model.addAttribute("email",email);
		return"success";
	}
}
