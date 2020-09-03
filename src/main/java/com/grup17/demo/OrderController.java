package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	

	@RequestMapping(value="/orders")
	public String order()
	{
		return "orders";
	}

}
