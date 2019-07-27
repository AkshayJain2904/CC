package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeeker;

public interface JobSeekerDao {
	void insert(JobSeeker jobSeeker);
	void delete(JobSeeker jobSeeker);
	void update(JobSeeker jobSeeker);
	JobSeeker getbyId(int id);
	List<JobSeeker> getAll();
}
