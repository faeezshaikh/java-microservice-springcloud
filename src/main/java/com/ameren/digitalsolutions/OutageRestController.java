package com.ameren.digitalsolutions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OutageRestController {
	
	@Value("${rate}")
	String rate;
	
	@Value("${lanecount}")
	String lanecount;
	
	@Value("${tollstart}")
	String tollstart;
	
	@Value("${connstring}")
	String connstring;

	
	@RequestMapping(value="/outages",method=RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Ameren";
	}


}
