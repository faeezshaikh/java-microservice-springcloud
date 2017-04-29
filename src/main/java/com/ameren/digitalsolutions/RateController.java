package com.ameren.digitalsolutions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {
	
	@Value("${message}")
	String message;
	
	@Value("${esrt}")
	String esrt;
	
	@Value("${outageStart}")
	String outageStart;
	
	@Value("${rds}")
	String rds;

	@RequestMapping("/rate")
	public String getRate(Model m) {

		m.addAttribute("message", message);
		m.addAttribute("esrt", esrt);
		m.addAttribute("outageStart", outageStart);
		m.addAttribute("rds", rds);
				
		//name of view
		return "rateview";
	}


}
