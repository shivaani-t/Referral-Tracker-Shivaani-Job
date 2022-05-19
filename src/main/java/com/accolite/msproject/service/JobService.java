package com.accolite.msproject.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.msproject.model.*;
import com.accolite.msproject.repo.*;

@Service
public class JobService {
	
	private final JobRepo jobRepo;

	@Autowired
	public JobService(JobRepo jobRepo) {
		this.jobRepo = jobRepo;
	}
	
	public List<Job> findAllJobs(){
		return jobRepo.findAll();
	}
	
	public Job addJob(Job job) {
		return jobRepo.save(job);
	}
	
	public Job updateJob(Job job) {
		return jobRepo.save(job);
	}
	
	public void deleteJob(Long jobid) {
		jobRepo.deleteById(jobid);
	}

}
