package com.loan.cb.entity;

public class Rate {

	private Integer id;
	private String loanType;
	private Double roi;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Double getRoi() {
		return roi;
	}
	public void setRoi(Double roi) {
		this.roi = roi;
	}
	public Rate(Integer id, String loanType, Double roi) {
		super();
		this.id = id;
		this.loanType = loanType;
		this.roi = roi;
	}
	
	
	
}
