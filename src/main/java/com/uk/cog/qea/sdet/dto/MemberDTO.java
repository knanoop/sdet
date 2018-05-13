/**
 * 
 */
package com.uk.cog.qea.sdet.dto;

import java.util.Date;

/**
 * @author 
 *
 */
public class MemberDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String mobileNumber;
	private String shortDetails;
	private String otherDetails;
	private Date createdDate;
	private Date modifiedDate;
	
	MemberDTO(){
		
	}
	
	public MemberDTO(Long id, String firstName, String lastName, String emailAddress, String mobileNumber,
			String shortDetails, String otherDetails, Date createdDate, Date modifiedDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.shortDetails = shortDetails;
		this.otherDetails = otherDetails;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the shortDetails
	 */
	public String getShortDetails() {
		return shortDetails;
	}
	/**
	 * @param shortDetails the shortDetails to set
	 */
	public void setShortDetails(String shortDetails) {
		this.shortDetails = shortDetails;
	}
	/**
	 * @return the otherDetails
	 */
	public String getOtherDetails() {
		return otherDetails;
	}
	/**
	 * @param otherDetails the otherDetails to set
	 */
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", mobileNumber=" + mobileNumber + ", shortDetails=" + shortDetails + ", otherDetails="
				+ otherDetails + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ "]";
	}

	
}
