package com.example.projectx.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RunStatus")
public class CurrentRunStatus {
	@Id
	private String runstatus;

	public CurrentRunStatus() {
		super();
	}

	public CurrentRunStatus(String runstatus) {
		super();
		this.runstatus = runstatus;
	}

	public String getRunstatus() {
		return runstatus;
	}

	public void setRunstatus(String runstatus) {
		this.runstatus = runstatus;
	}

}
