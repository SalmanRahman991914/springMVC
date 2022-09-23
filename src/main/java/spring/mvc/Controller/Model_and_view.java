package spring.mvc.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Model_and_view {
 @RequestMapping("/help")
	public ModelAndView help () {
 
	 System.out.println("this is model and view page");
	  
	 ModelAndView modelAndView=new  ModelAndView();
	 modelAndView.addObject("name"," Rahman Salman");
		modelAndView.addObject("rollnumber",121212); 
		
		return modelAndView; 
		
}

  private LocalDateTime LocalDateTime() {
  // TODO Auto-generated method stub
  return null; }
 
}
