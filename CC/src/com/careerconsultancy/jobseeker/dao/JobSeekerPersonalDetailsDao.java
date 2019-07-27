package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public interface JobSeekerPersonalDetailsDao {
	void insert(JobSeekerPersonalDetails jobSeekerPersonalDetails);
	void update(JobSeekerPersonalDetails jobSeekerPersonalDetails);
	void delete(JobSeekerPersonalDetails jobSeekerPersonalDetails);
	JobSeekerPersonalDetails getById(int id);
	List<JobSeekerPersonalDetails> getAll();
}
