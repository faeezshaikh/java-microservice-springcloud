package com.ameren.digitalsolutions;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OutageRestController {

	@RequestMapping(value="/outages",method=RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Ameren";
	}


}
