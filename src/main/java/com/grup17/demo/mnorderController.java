package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mnorderController {
	
	@RequestMapping(value="/menuorder")
	public String menrder()
	{
		return "menuorder";
	}

}
