package com.domain.models;

public class Production {

	int productionId;
	String productionName,address, ownerName;
	String year;
	public int getProductionId() {
		return productionId;
	}
	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Production(int productionId, String productionName, String address, String ownerName, String year) {
		super();
		this.productionId = productionId;
		this.productionName = productionName;
		this.address = address;
		this.ownerName = ownerName;
		this.year = year;
	}
	public Production(String productionName, String address, String ownerName, String year) {
		super();
		this.productionName = productionName;
		this.address = address;
		this.ownerName = ownerName;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Production [productionId=" + productionId + ", productionName=" + productionName + ", address="
				+ address + ", ownerName=" + ownerName + ", year=" + year + "]";
	}
	
}
