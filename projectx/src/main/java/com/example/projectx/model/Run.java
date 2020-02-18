package com.example.projectx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Run")
public class Run {
	@Id
	private String runid;
	private String projectType;
	private String RunType;
	private Date StartDate;
	private Date Enddate;
	private String clientName;
	private String Status;
	private String issues;
	public Run() {
		super();
	}
	public Run(String runid, String projectType, String runType, Date startDate, Date enddate, String clientName,
			String status, String issues) {
		super();
		this.runid = runid;
		this.projectType = projectType;
		RunType = runType;
		StartDate = startDate;
		Enddate = enddate;
		this.clientName = clientName;
		Status = status;
		this.issues = issues;
	}
	@Override
	public String toString() {
		return "Run [runid=" + runid + ", projectType=" + projectType + ", RunType=" + RunType + ", StartDate="
				+ StartDate + ", Enddate=" + Enddate + ", clientName=" + clientName + ", Status=" + Status + ", issues="
				+ issues + "]";
	}
	public String getRunid() {
		return runid;
	}
	public void setRunid(String runid) {
		this.runid = runid;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getRunType() {
		return RunType;
	}
	public void setRunType(String runType) {
		RunType = runType;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEnddate() {
		return Enddate;
	}
	public void setEnddate(Date enddate) {
		Enddate = enddate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	
	
	
}
