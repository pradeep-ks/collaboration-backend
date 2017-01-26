package com.niit.collaboration.backend.dao;

import java.util.List;

import com.niit.collaboration.backend.model.AppliedJob;
import com.niit.collaboration.backend.model.Job;

public interface JobDao {

	void add(Job job);
	
	void update(Job job);
	
	Job getJobById(long jobId);
	
	List<Job> listJobs();
	
	List<AppliedJob> listAppliedJobs(long userId);
	
	void saveAppliedJob(AppliedJob appliedJob);
	
}
