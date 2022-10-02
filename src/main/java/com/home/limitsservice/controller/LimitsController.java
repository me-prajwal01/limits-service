package com.home.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.limitsservice.beans.Limits;
import com.home.limitsservice.config.MyConfig;

@RestController
public class LimitsController {

	@Autowired
	private MyConfig myConfig;

	@GetMapping(value = "/limits")
	public Limits getLimits() {
		return new Limits(myConfig.getMin(), myConfig.getMax());
	}

}
