package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;

public interface JobSeekerEducationalDetailsDao {
	void insert(JobSeekerEducationalDetails jobSeekerEducationalDetails);
	void delete(JobSeekerEducationalDetails jobSeekerEducationalDetails);
	void update(JobSeekerEducationalDetails jobSeekerEducationalDetails);
	JobSeekerEducationalDetails getbyId(int id);
	List<JobSeekerEducationalDetails> getAll();
}
