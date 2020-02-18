package com.example.projectx.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectType")
public class ProjectType {
	@Id
	private String projectTypeId;
	private String ProjectType;
	public ProjectType() {
		super();
	}
	public ProjectType(String projectTypeId, String projectType) {
		super();
		this.projectTypeId = projectTypeId;
		ProjectType = projectType;
	}
	public String getProjectTypeId() {
		return projectTypeId;
	}
	public void setProjectTypeId(String projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
	public String getProjectType() {
		return ProjectType;
	}
	public void setProjectType(String projectType) {
		ProjectType = projectType;
	}

}
