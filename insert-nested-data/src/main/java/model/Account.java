package model;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
	private Integer id;
	private String accounttype;
	private Float accountBalance;
	private String accountStatus;
	private Date accountOpeningDate;
	private Date modifiedDate;
	private Integer customerId;
	
    public Account() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	public Float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
