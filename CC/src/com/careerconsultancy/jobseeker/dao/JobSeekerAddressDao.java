package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;

public interface JobSeekerAddressDao {
	void insert(JobSeekerAddress jobSeekerAddress);
	void delete(JobSeekerAddress jobSeekerAddress);
	void update(JobSeekerAddress jobSeekerAddress);
	JobSeekerAddress getbyId(int id);
	List<JobSeekerAddress> getAll();
}
