package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id	
	private Integer acc_Id;
	
	@Column(length=12)
	private String acc_Name;
	@Column(length=12)
	private String acc_EmailId;
	@Column(length=12)
	private Integer acc_Amount;
	public Integer getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(Integer acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	public String getAcc_EmailId() {
		return acc_EmailId;
	}
	public void setAcc_EmailId(String acc_EmailId) {
		this.acc_EmailId = acc_EmailId;
	}
	public Integer getAcc_Amount() {
		return acc_Amount;
	}
	public void setAcc_Amount(Integer acc_Amount) {
		this.acc_Amount = acc_Amount;
	}
	
}
