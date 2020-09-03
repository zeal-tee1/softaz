package com.grup17.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriveController {
	
	@RequestMapping(value="/driver")
	public String drive()
	{
		return "driver";
	}

}
