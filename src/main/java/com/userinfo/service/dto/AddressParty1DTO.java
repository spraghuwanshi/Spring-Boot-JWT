package com.userinfo.service.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


public class AddressParty1DTO   {
  @JsonProperty("AddressId")
  private Integer addressId = null;

  @JsonProperty("CompanyName")
  private String companyName = null;

  @JsonProperty("PartyName")
  private String partyName = null;

  @JsonProperty("WorkPhoneNumber")
  private String workPhoneNumber = null;

  @JsonProperty("MobileNumber")
  private String mobileNumber = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("State")
  private String state = null;

  @JsonProperty("CountryCode")
  private String countryCode = null;

  @JsonProperty("AddressNote")
  private String addressNote = null;

  @JsonProperty("AccountCode")
  private String accountCode = null;

  @JsonProperty("ReceiverAddressType")
  private String receiverAddressType = null;

  @JsonProperty("BusinesstaxNumber")
  private String businesstaxNumber = null;

  @JsonProperty("AddressType")
  private String addressType = null;

  @JsonProperty("CreatedTs")
  private DateTime createdTs = null;

  @JsonProperty("CreatedBy")
  private String createdBy = null;

  @JsonProperty("LastModifiedTs")
  private DateTime lastModifiedTs = null;

  @JsonProperty("LastModifiedBy")
  private String lastModifiedBy = null;

  public AddressParty1DTO addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public AddressParty1DTO companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AddressParty1DTO partyName(String partyName) {
    this.partyName = partyName;
    return this;
  }

   /**
   * Get partyName
   * @return partyName
  **/
  @ApiModelProperty(value = "")
  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  public AddressParty1DTO workPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
    return this;
  }

   /**
   * Get workPhoneNumber
   * @return workPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public void setWorkPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
  }

  public AddressParty1DTO mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public AddressParty1DTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddressParty1DTO postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public AddressParty1DTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressParty1DTO countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressParty1DTO addressNote(String addressNote) {
    this.addressNote = addressNote;
    return this;
  }

   /**
   * Get addressNote
   * @return addressNote
  **/
  @ApiModelProperty(value = "")
  public String getAddressNote() {
    return addressNote;
  }

  public void setAddressNote(String addressNote) {
    this.addressNote = addressNote;
  }

  public AddressParty1DTO accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Get accountCode
   * @return accountCode
  **/
  @ApiModelProperty(value = "")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public AddressParty1DTO receiverAddressType(String receiverAddressType) {
    this.receiverAddressType = receiverAddressType;
    return this;
  }

   /**
   * Get receiverAddressType
   * @return receiverAddressType
  **/
  @ApiModelProperty(value = "")
  public String getReceiverAddressType() {
    return receiverAddressType;
  }

  public void setReceiverAddressType(String receiverAddressType) {
    this.receiverAddressType = receiverAddressType;
  }

  public AddressParty1DTO businesstaxNumber(String businesstaxNumber) {
    this.businesstaxNumber = businesstaxNumber;
    return this;
  }

   /**
   * Get businesstaxNumber
   * @return businesstaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getBusinesstaxNumber() {
    return businesstaxNumber;
  }

  public void setBusinesstaxNumber(String businesstaxNumber) {
    this.businesstaxNumber = businesstaxNumber;
  }

  public AddressParty1DTO addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public AddressParty1DTO createdTs(DateTime createdTs) {
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Get createdTs
   * @return createdTs
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(DateTime createdTs) {
    this.createdTs = createdTs;
  }

  public AddressParty1DTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AddressParty1DTO lastModifiedTs(DateTime lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
    return this;
  }

   /**
   * Get lastModifiedTs
   * @return lastModifiedTs
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastModifiedTs() {
    return lastModifiedTs;
  }

  public void setLastModifiedTs(DateTime lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
  }

  public AddressParty1DTO lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressParty1DTO addressParty1DTO = (AddressParty1DTO) o;
    return Objects.equals(this.addressId, addressParty1DTO.addressId) &&
        Objects.equals(this.companyName, addressParty1DTO.companyName) &&
        Objects.equals(this.partyName, addressParty1DTO.partyName) &&
        Objects.equals(this.workPhoneNumber, addressParty1DTO.workPhoneNumber) &&
        Objects.equals(this.mobileNumber, addressParty1DTO.mobileNumber) &&
        Objects.equals(this.email, addressParty1DTO.email) &&
        Objects.equals(this.postCode, addressParty1DTO.postCode) &&
        Objects.equals(this.state, addressParty1DTO.state) &&
        Objects.equals(this.countryCode, addressParty1DTO.countryCode) &&
        Objects.equals(this.addressNote, addressParty1DTO.addressNote) &&
        Objects.equals(this.accountCode, addressParty1DTO.accountCode) &&
        Objects.equals(this.receiverAddressType, addressParty1DTO.receiverAddressType) &&
        Objects.equals(this.businesstaxNumber, addressParty1DTO.businesstaxNumber) &&
        Objects.equals(this.addressType, addressParty1DTO.addressType) &&
        Objects.equals(this.createdTs, addressParty1DTO.createdTs) &&
        Objects.equals(this.createdBy, addressParty1DTO.createdBy) &&
        Objects.equals(this.lastModifiedTs, addressParty1DTO.lastModifiedTs) &&
        Objects.equals(this.lastModifiedBy, addressParty1DTO.lastModifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, companyName, partyName, workPhoneNumber, mobileNumber, email, postCode, state, countryCode, addressNote, accountCode, receiverAddressType, businesstaxNumber, addressType, createdTs, createdBy, lastModifiedTs, lastModifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressParty1 {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    workPhoneNumber: ").append(toIndentedString(workPhoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    addressNote: ").append(toIndentedString(addressNote)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    receiverAddressType: ").append(toIndentedString(receiverAddressType)).append("\n");
    sb.append("    businesstaxNumber: ").append(toIndentedString(businesstaxNumber)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedTs: ").append(toIndentedString(lastModifiedTs)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

