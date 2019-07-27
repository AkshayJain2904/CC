package com.careerconsultancy.entities.jobseeker;

import java.io.File;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JobSeekerProffesionalDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsProffesionalDetailsId;
	@OneToOne
	private JobSeeker jobSeeker;
	private int totalExperienceInYears;
	private String jobProfile;
	private String industry;
	private String functionalArea;
	private String skillSet;
	private File resume;
	private File image;
	
	public JobSeekerProffesionalDetails() {
		super();
	}

	public JobSeekerProffesionalDetails(int totalExperienceInYears, String jobProfile, String industry,
			String functionalArea, String skillSet, File resume, File image) {
		super();
		this.totalExperienceInYears = totalExperienceInYears;
		this.jobProfile = jobProfile;
		this.industry = industry;
		this.functionalArea = functionalArea;
		this.skillSet = skillSet;
		this.resume = resume;
		this.image = image;
	}

	public int getTotalExperienceInYears() {
		return totalExperienceInYears;
	}

	public void setTotalExperienceInYears(int totalExperienceInYears) {
		this.totalExperienceInYears = totalExperienceInYears;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getFunctionalArea() {
		return functionalArea;
	}

	public void setFunctionalArea(String functionalArea) {
		this.functionalArea = functionalArea;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public File getResume() {
		return resume;
	}

	public void setResume(File resume) {
		this.resume = resume;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}
	
	

	public int getJsProffesionalDetailsId() {
		return jsProffesionalDetailsId;
	}

	public void setJsProffesionalDetailsId(int jsProffesionalDetailsId) {
		this.jsProffesionalDetailsId = jsProffesionalDetailsId;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	@Override
	public String toString() {
		return "JobSeekerProffesionalDetails [jsProffesionalDetailsId=" + jsProffesionalDetailsId + ", jsId=" 
				+ ", totalExperienceInYears=" + totalExperienceInYears + ", jobProfile=" + jobProfile + ", industry="
				+ industry + ", functionalArea=" + functionalArea + ", skillSet=" + skillSet + ", resume=" + resume
				+ ", image=" + image + "]";
	}

}
