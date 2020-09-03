package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {
	
	@RequestMapping(value="/invoice")
	public String invoice()
	{
		return "invoice";
	}


}
