package com.coffee.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	private User freshGround;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

    @RequestMapping("/register")
    public ModelAndView RegistrationPage() {
        return new ModelAndView("register");
    }
    
    @RequestMapping("newUser")
    public ModelAndView userRegistration(@RequestParam("userName") String userName, @RequestParam("pwd") String password, @RequestParam("first") String first, @RequestParam("last") String last) {
    	freshGround = new User(userName, password, first, last);
    	ModelAndView mv = new ModelAndView("welcome", "hiya", "Hello, " + freshGround.getFirst());
        return mv;
    }
    
    @RequestMapping("enter")
    public ModelAndView accessSite() {
    	return new ModelAndView("coffee");
    }
	
    
	
}
