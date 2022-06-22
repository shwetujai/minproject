package com.demo.modal;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Contect {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private int ContactId;
	@Column (name="CONTACT_NAME")
	private String ContectName;
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	@Column(name="CONTACT_EMAIL")
	private String ContactEmail;
	@Column(name="ACTIVE_SW")
	private Character activeSw;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	public int getContactId() {
		return ContactId;
	}
	public void setContactId(int contactId) {
		ContactId = contactId;
	}
	public String getContectName() {
		return ContectName;
	}
	public void setContectName(String contectName) {
		ContectName = contectName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public Character getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(Character activeSw) {
		this.activeSw = activeSw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Contect [ContactId=" + ContactId + ", ContectName=" + ContectName + ", contactNumber=" + contactNumber
				+ ", ContactEmail=" + ContactEmail + ", activeSw=" + activeSw + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	

}
