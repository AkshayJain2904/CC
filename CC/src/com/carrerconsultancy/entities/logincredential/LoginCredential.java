package com.carrerconsultancy.entities.logincredential;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.careerconsultancy.entities.employee.EmployeeDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
@Entity
public class LoginCredential {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loginId;
	private String emailId;
	private String password;
	private String role;
	
	
	public LoginCredential() {
		super();
	}
	
	public LoginCredential(String emailId, String password, String role) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginCredential(String role) {
		super();
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
