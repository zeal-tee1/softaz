package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KitchenController {
	
	@RequestMapping(value="/kitchen")
	public String kitchen()
	{
		return "kitchen";
	}

}
