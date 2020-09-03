package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffController {
	
	@RequestMapping(value="/staff")
	public String employ()
	{
		return "staff";
	}
}
