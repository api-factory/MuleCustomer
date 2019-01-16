package com.demo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Customer {

	  private Integer id;
	  private String customerName;
	  private String gender;
	  private Double mobile;
	  private String email;
	  private String IdentityProof;
	  private Date  DOB;
	  private List<Address> address;

	  
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Double getMobile() {
		return mobile;
	}
	public void setMobile(Double mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityProof() {
		return IdentityProof;
	}
	public void setIdentityProof(String identityProof) {
		IdentityProof = identityProof;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	  
	  
}
