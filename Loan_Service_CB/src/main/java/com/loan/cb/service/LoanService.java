package com.loan.cb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.loan.cb.dto.RateOfIntrestResBean;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.log4j.Log4j;

@Service
public class LoanService {

	@Autowired
	private RestTemplate restTemplate;
	
	private final static String urlOfLoanService="http://localhost:8080/roi/{type}";
	
   private static final String Circuit_Breaker_Name="loan-service";
	
	@CircuitBreaker(name="loan-service", fallbackMethod = "fallBackMethodForRoi")
	public RateOfIntrestResBean getRateOfIntByType( String type) {
		System.out.println("................Orginal Method Called.............");
		ResponseEntity<RateOfIntrestResBean> responseEntity = this.restTemplate.getForEntity(urlOfLoanService, RateOfIntrestResBean.class, type);
		RateOfIntrestResBean body = responseEntity.getBody();
		return body;
	}
	
	public RateOfIntrestResBean fallBackMethodForRoi(String type,Exception e) {
		
	 System.out.println("..........Fall Back MethoD Called..........");
		
		return new RateOfIntrestResBean();
		
	}
	
	
}
