package com.accolite.msproject;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.msproject.model.*;
import com.accolite.msproject.repo.*;
import com.accolite.msproject.service.*;

@RestController
@RequestMapping("/job")
public class JobResource {
	
	private final JobService jobService;

	public JobResource(JobService jobService) {
		this.jobService = jobService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Job>> getAllJobs(){
		List<Job> jobs = jobService.findAllJobs();
		return new ResponseEntity<>(jobs, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Job> addJob(@RequestBody Job job){
		Job newJob = jobService.addJob(job);
		return new ResponseEntity<>(newJob, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Job> updateJob(@RequestBody Job job){
		Job updateJob = jobService.updateJob(job);
		return new ResponseEntity<>(updateJob, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteJob(@PathVariable("id") Long jobid){
		jobService.deleteJob(jobid);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
