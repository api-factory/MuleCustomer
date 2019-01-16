package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Customer implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String customerName;
	private String gender;
	private Long mobile;
	private String email;
	private String identityProof;
	private Date dob;
	private Date modifiedDate;
	private Date createdDate;
	private List<Address> address;
	private List<Account> account;

	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
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

	public String getIdentityProof() {
		return identityProof;
	}

	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
}
