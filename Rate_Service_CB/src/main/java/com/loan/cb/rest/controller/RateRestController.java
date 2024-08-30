package com.loan.cb.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.cb.entity.Rate;

@RestController
public class RateRestController {

	@GetMapping("/roi/{type}")
	public Rate getRoiByLoanType(@PathVariable("type") String type) {
	
	String loanType = type.toUpperCase();
	
	Rate rate=new Rate(1, loanType, 12.0);
	 return rate;
		
	}
	
	
}
