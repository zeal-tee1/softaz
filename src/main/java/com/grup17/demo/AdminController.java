package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String goadmin()
	{
		return "admin";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String again(@ModelAttribute(name="loginform") LoginForm loginform, Model model)
	{
		String username = loginform.getUsername();
		String password = loginform.getPassword();
		
		if(username.trim().isEmpty() && password.trim().isEmpty())
		{
			model.addAttribute("invalidCredentials", true);
			return "admin";
			
			
		}
		
		else if(username.trim().isEmpty() || password.trim().isEmpty())
		{
			model.addAttribute("invalidCredentials", true);
			return "admin";
		}
		
		else if("admin".equals(username) && "admin".equals(password)) {
		
			return "manager";
		}
		else
		{
			return "admin";
		}
	}

}
