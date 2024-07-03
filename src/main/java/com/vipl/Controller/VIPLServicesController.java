package com.vipl.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Showcase")
public class VIPLServicesController {
	
	private static Logger logger = Logger.getLogger("VIPLServicesController");
	
	@GetMapping("/VIPLServicesPage")
	public String getVIPLServicesPage() {
		
		logger.info("VIPLServicesController : getVIPLServicesPage Method Started...");
		
		try {
			logger.info("VIPLServicesController : getVIPLServicesPage Method Ended...");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("VIPLServicesController : Exception occured while getVIPLServicesPage method is running ", e);
			return null;
		}
		
		return "VIPLServices";
	}

}
