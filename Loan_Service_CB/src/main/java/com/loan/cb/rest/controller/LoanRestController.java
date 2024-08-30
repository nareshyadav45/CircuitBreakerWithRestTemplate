package com.loan.cb.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loan.cb.dto.RateOfIntrestResBean;
import com.loan.cb.service.LoanService;

@RestController
public class LoanRestController {

	@Autowired
	private LoanService loanService;
	
	@GetMapping("/loans")
	public RateOfIntrestResBean rateOfIntrest(@RequestParam("type") String type) {
		RateOfIntrestResBean rateOfIntrestResBean = this.loanService.getRateOfIntByType(type);
	    return rateOfIntrestResBean;
	}
	
}
