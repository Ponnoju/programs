package com.javapoint.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javapoint.microservices.limitsservice.model.LimitsConfiguration;

@RestController
public class LimitsConfigrationController {
	@Autowired
	private LimitsConfiguration LimitsConfiguration;
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		return new LimitsConfiguration(LimitsConfiguration.getMaximum(), LimitsConfiguration.getMinimum());
	}
}
