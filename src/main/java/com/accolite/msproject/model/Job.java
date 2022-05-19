package com.accolite.msproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {
	
	private String title;
	private String description;
	@Id
	@Column(nullable = false, updatable = false)
	private Long jobid;
	private String location;
	private String requirements;
	private String experience;
	
	public Job() {}
	
	public Job(String title, Long jobid, String location) {

		this.title = title;
		this.jobid = jobid;
		this.location = location;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getJobid() {
		return jobid;
	}
	public void setJobid(Long jobid) {
		this.jobid = jobid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Job{" +
			"title=" + title +
			", description='" + description + '\'' +
			", jobid='" + jobid + '\'' +
			", location='" + location + '\'' +
			", requirements='" + requirements + '\'' +
			", experience='" + experience + '\'' +
			'}';
	}

}
