package com.careerconsultancy.entities.jobseeker;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

@Entity
public class JobSeekerPersonalDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsPersonalDetailsId;
	@OneToOne
	private JobSeeker jobSeeker;
	private String jsFirstName;
	private String jsLastName;
	private String jSfathersName;
	private String gender;
	private Date dob;
	private String jsemail;
	private int jSmobNo;
	private String jSpassword;
	
	public JobSeekerPersonalDetails() {
		super();
	}

	public JobSeekerPersonalDetails(String jsFirstName, String jsLastName,
			String jSfathersName, String gender, Date dob, String jsemail, int jSmobNo, String jSpassword) {
		super();
		this.jsFirstName = jsFirstName;
		this.jsLastName = jsLastName;
		this.jSfathersName = jSfathersName;
		this.gender = gender;
		this.dob = dob;
		this.jsemail = jsemail;
		this.jSmobNo = jSmobNo;
		this.jSpassword = jSpassword;
	}

	public int getJsPersonalDetailsId() {
		return jsPersonalDetailsId;
	}

	public String getJsFirstName() {
		return jsFirstName;
	}

	public void setJsFirstName(String jsFirstName) {
		this.jsFirstName = jsFirstName;
	}

	public String getJsLastName() {
		return jsLastName;
	}

	public void setJsLastName(String jsLastName) {
		this.jsLastName = jsLastName;
	}

	public String getjSfathersName() {
		return jSfathersName;
	}

	public void setjSfathersName(String jSfathersName) {
		this.jSfathersName = jSfathersName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getJsemail() {
		return jsemail;
	}

	public void setJsemail(String jsemail) {
		this.jsemail = jsemail;
	}

	public int getjSmobNo() {
		return jSmobNo;
	}

	public void setjSmobNo(int jSmobNo) {
		this.jSmobNo = jSmobNo;
	}

	public String getjSpassword() {
		return jSpassword;
	}

	public void setjSpassword(String jSpassword) {
		this.jSpassword = jSpassword;
	}
	

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public void setJsPersonalDetailsId(int jsPersonalDetailsId) {
		this.jsPersonalDetailsId = jsPersonalDetailsId;
	}

	@Override
	public String toString() {
		return "JobSeekerPersonalDetails [jsPersonalDetailsId=" + jsPersonalDetailsId + ", jsId="
				+ ", jsFirstName=" + jsFirstName + ", jsLastName=" + jsLastName + ", jSfathersName=" + jSfathersName
				+ ", gender=" + gender + ", dob=" + dob + ", jsemail=" + jsemail + ", jSmobNo=" + jSmobNo
				+ ", jSpassword=" + jSpassword + "]";
	}
	
	
	
	
	
}
