package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;

public interface JobSeekerProffesionalDetailsDao {
	void insert(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
	void delete(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
	void update(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
	JobSeekerProffesionalDetails getbyId(int id);
	List<JobSeekerProffesionalDetails> getAll();
}
