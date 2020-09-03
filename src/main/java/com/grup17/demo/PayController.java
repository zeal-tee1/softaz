package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayController {
	
	@RequestMapping(value="/pay")
	public String pau()
	{
		return "pay";
	}

}
