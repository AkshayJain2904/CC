package com.careerconsultancy.entities.jobseeker;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JobSeekerEducationalDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsEducationalDetailId;
	@OneToOne
	private JobSeeker jobSeeker;
	private double tenthPercentage;
	private String tenthBoard;
	private double twelthPercentage;
	private String twelthBoard;
	private double graduationPercentage;
	private String graduation;
	private String graduationSpecialization;
	private double postGraduationPercentage;
	private String postGraduation;
	private String postGraduationSpecialization;
	
	
	public JobSeekerEducationalDetails() {
		super();
	}


	public JobSeekerEducationalDetails(double tenthPercentage, String tenthBoard, double twelthPercentage,
			String twelthBoard, double graduationPercentage, String graduation, String graduationSpecialization,
			double postGraduationPercentage, String postGraduation, String postGraduationSpecialization) {
		super();
		this.tenthPercentage = tenthPercentage;
		this.tenthBoard = tenthBoard;
		this.twelthPercentage = twelthPercentage;
		this.twelthBoard = twelthBoard;
		this.graduationPercentage = graduationPercentage;
		this.graduation = graduation;
		this.graduationSpecialization = graduationSpecialization;
		this.postGraduationPercentage = postGraduationPercentage;
		this.postGraduation = postGraduation;
		this.postGraduationSpecialization = postGraduationSpecialization;
	}

	


	public int getJsEducationalDetailId() {
		return jsEducationalDetailId;
	}

	

	public double getTenthPercentage() {
		return tenthPercentage;
	}



	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}



	public String getTenthBoard() {
		return tenthBoard;
	}



	public void setTenthBoard(String tenthBoard) {
		this.tenthBoard = tenthBoard;
	}



	public double getTwelthPercentage() {
		return twelthPercentage;
	}



	public void setTwelthPercentage(double twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}



	public String getTwelthBoard() {
		return twelthBoard;
	}



	public void setTwelthBoard(String twelthBoard) {
		this.twelthBoard = twelthBoard;
	}



	public double getGraduationPercentage() {
		return graduationPercentage;
	}



	public void setGraduationPercentage(double graduationPercentage) {
		this.graduationPercentage = graduationPercentage;
	}



	public String getGraduation() {
		return graduation;
	}



	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public double getPostGraduationPercentage() {
		return postGraduationPercentage;
	}



	public void setPostGraduationPercentage(double postGraduationPercentage) {
		this.postGraduationPercentage = postGraduationPercentage;
	}



	public String getPostGraduation() {
		return postGraduation;
	}



	public void setPostGraduation(String postGraduation) {
		this.postGraduation = postGraduation;
	}

	

	public String getGraduationSpecialization() {
		return graduationSpecialization;
	}


	public void setGraduationSpecialization(String graduationSpecialization) {
		this.graduationSpecialization = graduationSpecialization;
	}


	public String getPostGraduationSpecialization() {
		return postGraduationSpecialization;
	}


	public void setPostGraduationSpecialization(String postGraduationSpecialization) {
		this.postGraduationSpecialization = postGraduationSpecialization;
	}

	
	
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}


	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}


	public void setJsEducationalDetailId(int jsEducationalDetailId) {
		this.jsEducationalDetailId = jsEducationalDetailId;
	}


	@Override
	public String toString() {
		return "JobSeekerEducationalDetails [jsEducationalDetailId=" + jsEducationalDetailId + ", jsId=" 
				+ ", tenthPercentage=" + tenthPercentage + ", tenthBoard=" + tenthBoard + ", twelthPercentage="
				+ twelthPercentage + ", twelthBoard=" + twelthBoard + ", graduationPercentage=" + graduationPercentage
				+ ", graduation=" + graduation + ", graduationSpecialization=" + graduationSpecialization
				+ ", postGraduationPercentage=" + postGraduationPercentage + ", postGraduation=" + postGraduation
				+ ", postGraduationSpecialization=" + postGraduationSpecialization + "]";
	}
	
	
	
	
	
	
	
}
