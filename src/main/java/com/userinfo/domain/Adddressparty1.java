package com.userinfo.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;


/**
 * The persistent class for the adddressparty1 database table.
 * 
 */
@Data
@Entity
@NamedQuery(name="Adddressparty1.findAll", query="SELECT a FROM Adddressparty1 a")
public class Adddressparty1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String addressId;

	private String accountCode;

	private String addressNote;

	private String addressType;

	private String businesstaxNumber;

	private String companyName;

	private String countryCode;

	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTs;

	private String email;

	private String lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedTs;

	private String mobileNumber;

	private String partyName;

	private String postCode;

	private String receiverAddressType;

	private String state;

	private String workPhoneNumber;

	public Adddressparty1() {
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAccountCode() {
		return this.accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAddressNote() {
		return this.addressNote;
	}

	public void setAddressNote(String addressNote) {
		this.addressNote = addressNote;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getBusinesstaxNumber() {
		return this.businesstaxNumber;
	}

	public void setBusinesstaxNumber(String businesstaxNumber) {
		this.businesstaxNumber = businesstaxNumber;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedTs() {
		return this.lastModifiedTs;
	}

	public void setLastModifiedTs(Date lastModifiedTs) {
		this.lastModifiedTs = lastModifiedTs;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getReceiverAddressType() {
		return this.receiverAddressType;
	}

	public void setReceiverAddressType(String receiverAddressType) {
		this.receiverAddressType = receiverAddressType;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWorkPhoneNumber() {
		return this.workPhoneNumber;
	}

	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

}