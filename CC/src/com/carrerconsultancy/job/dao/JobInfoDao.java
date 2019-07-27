package com.carrerconsultancy.job.dao;

import java.util.List;
import com.carrerconsultancy.entities.job.JobInfo;

public interface JobInfoDao {
	void insert(JobInfo jobInfo);
	void delete(JobInfo jobInfo);
	void update(JobInfo jobInfo);
	JobInfo getbyId(int id);
	List<JobInfo> getAll();

}
