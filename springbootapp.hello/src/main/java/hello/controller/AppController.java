package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	
	@RequestMapping(value="/add" ,method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2)
	{
		System.out.println(" Num1 :"+num1 +" , Num2 :"+num2);
		int k=num1 + num2;
		System.out.println(" Total :"+k);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("result", k);
		mv.setViewName("display.jsp");
		
		return mv;
		
		//return "display.jsp";
	}
	
	@RequestMapping(value="/addTest" ,method = RequestMethod.GET)
	public ModelAndView addTest()
	{
		System.out.println(" Inside Add Test :");
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("result", 5);
		mv.setViewName("display.jsp");
		
		return mv;
		
		//return "display.jsp";
	}

}
