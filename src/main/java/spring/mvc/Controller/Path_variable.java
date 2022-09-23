package spring.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Path_variable {
@RequestMapping("/one/{userId}")
	public String first(@PathVariable("userId")int userId) {
	System.out.println(userId);
		return "first";
		
	}
}
