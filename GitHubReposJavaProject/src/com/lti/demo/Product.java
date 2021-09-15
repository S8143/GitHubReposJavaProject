package com.lti.demo;

public class Product {
	
	private int prdId;
	private String pdrName;
	private double prdCost;
	
	public Product() {
		super();
	}
	public Product(int prdId, String pdrName, double prdCost) {
		super();
		this.prdId = prdId;
		this.pdrName = pdrName;
		this.prdCost = prdCost;
	}
	public int getPrdId() {
		return prdId;
		
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPdrName() {
		return pdrName;
	}
	public void setPdrName(String pdrName) {
		this.pdrName = pdrName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", pdrName=" + pdrName + ", prdCost=" + prdCost + "]";
	}
	
	
	

}
