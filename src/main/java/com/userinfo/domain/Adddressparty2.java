package com.userinfo.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import lombok.Data;

import java.util.Date;


/**
 * The persistent class for the adddressparty2 database table.
 * 
 */
@Data 
@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Adddressparty2 implements Serializable {
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

}