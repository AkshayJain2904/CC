package com.careerconsultancy.entities.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String empFirstName;
	private String empLastName;
	private String empEmail;
	private String empPassword;
	private long empMobNo;
	private String companyName;
	
	
	
	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(String empFirstName, String empLastName, String empEmail, String empPassword,
			long empMobNo, String companyName) {
		super();
		
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
		this.empMobNo = empMobNo;
		this.companyName = companyName;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public long getEmpMobNo() {
		return empMobNo;
	}

	public void setEmpMobNo(long empMobNo) {
		this.empMobNo = empMobNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", empFirstName=" + empFirstName + ", empLastName="
				+ empLastName + ", empEmail=" + empEmail + ", empPassword=" + empPassword + ", empMobNo=" + empMobNo
				+ ", companyName=" + companyName + "]";
	}
	
	
}
