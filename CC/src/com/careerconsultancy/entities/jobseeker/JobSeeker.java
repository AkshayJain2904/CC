package com.careerconsultancy.entities.jobseeker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class JobSeeker {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsId;
	 
	@OneToOne
	private JobSeekerPersonalDetails jobSeekerPersonalDetails;
	@OneToOne
	private JobSeekerEducationalDetails jobSeekerEducationalDetails;
	@OneToOne
	private JobSeekerAddress jobSeekerAddress;
	@OneToOne
	private JobSeekerProffesionalDetails jobSeekerProffesionalDetails;
	

	public JobSeekerPersonalDetails getJobSeekerPersonalDetails() {
		return jobSeekerPersonalDetails;
	}
	




	public void setJobSeekerPersonalDetails(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		this.jobSeekerPersonalDetails = jobSeekerPersonalDetails;
	}




	public JobSeekerEducationalDetails getJobSeekerEducationalDetails() {
		return jobSeekerEducationalDetails;
	}




	public void setJobSeekerEducationalDetails(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		this.jobSeekerEducationalDetails = jobSeekerEducationalDetails;
	}




	public JobSeekerAddress getJobSeekerContactDetails() {
		return jobSeekerAddress;
	}




	public void setJobSeekerContactDetails(JobSeekerAddress jobSeekerAddress) {
		this.jobSeekerAddress = jobSeekerAddress;
	}




	public JobSeekerProffesionalDetails getJobSeekerProffesionalDetails() {
		return jobSeekerProffesionalDetails;
	}




	public void setJobSeekerProffesionalDetails(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		this.jobSeekerProffesionalDetails = jobSeekerProffesionalDetails;
	}

}
