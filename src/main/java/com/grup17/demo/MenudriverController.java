package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenudriverController {
	
	@RequestMapping(value="/menudriver")
	public String mdr()
	{
		return "menudriver";
	}

}
