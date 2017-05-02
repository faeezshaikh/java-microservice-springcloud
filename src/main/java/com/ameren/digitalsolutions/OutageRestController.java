package com.ameren.digitalsolutions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OutageRestController {

	@Value("${message}")
	String message;

	@Value("${esrt}")
	String esrt;

	@Value("${outageStart}")
	String outageStart;

	@Value("${rds}")
	String rds;

	

	@RequestMapping(value = "/outage", method = RequestMethod.GET)
	@ResponseBody
	public Outage sayHello() {
		Outage o = new Outage(message,esrt,outageStart,rds);
		
		return o;
	}

	private class Outage {
		private String mesage;
		private String esrt;
		private String startTime;
		private String rdsConnectionString;
		public Outage(String mesage, String esrt, String startTime, String rdsConnectionString) {
			super();
			this.mesage = mesage;
			this.esrt = esrt;
			this.startTime = startTime;
			this.rdsConnectionString = rdsConnectionString;
		}
		public String getMesage() {
			return mesage;
		}
		public void setMesage(String mesage) {
			this.mesage = mesage;
		}
		public String getEsrt() {
			return esrt;
		}
		public void setEsrt(String esrt) {
			this.esrt = esrt;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getRdsConnectionString() {
			return rdsConnectionString;
		}
		public void setRdsConnectionString(String rdsConnectionString) {
			this.rdsConnectionString = rdsConnectionString;
		}
		
		

	}

}
