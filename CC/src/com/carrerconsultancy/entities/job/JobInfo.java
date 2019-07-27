package com.carrerconsultancy.entities.job;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class JobInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobId;
	private String jobTitle;
	private double criteria;
	private String location;
	private double salary;
	private String skillSet;
	private String companyName;
	
	
	public JobInfo() {
		super();
	}
	
	public JobInfo(String jobTitle, double criteria, String location, double salary, String skillSet,
			String companyName) {
		super();
		this.jobTitle = jobTitle;
		this.criteria = criteria;
		this.location = location;
		this.salary = salary;
		this.skillSet = skillSet;
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getCriteria() {
		return criteria;
	}
	public void setCriteria(double criteria) {
		this.criteria = criteria;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return "JobInfo [jobId=" + jobId + ", jobTitle=" + jobTitle + ", criteria=" + criteria + ", location="
				+ location + ", salary=" + salary + ", skillSet=" + skillSet + ", companyName=" + companyName + "]";
	}
}
