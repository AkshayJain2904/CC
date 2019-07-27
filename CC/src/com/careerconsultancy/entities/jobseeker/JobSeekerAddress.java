package com.careerconsultancy.entities.jobseeker;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JobSeekerAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsContactDetailId;
	@OneToOne
	private JobSeeker jobSeeker;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public JobSeekerAddress() {
		super();
	}

	
	
	public int getJsContactDetailId() {
		return jsContactDetailId;
	}



	public void setJsContactDetailId(int jsContactDetailId) {
		this.jsContactDetailId = jsContactDetailId;
	}



	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}



	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}



	public JobSeekerAddress(String houseNo, String street, String city,
			String state, String country, int pincode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getJsContactlDetailId() {
		return jsContactDetailId;
	}



	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "JobSeekerAddress [jsContactlDetailId=" + jsContactDetailId + ", jsId="  + ", houseNo="
				+ houseNo + ", street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
