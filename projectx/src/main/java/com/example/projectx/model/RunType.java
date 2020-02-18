package com.example.projectx.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RunType")
public class RunType {
	@Id
	private String runtypeid;
	private String runType;
	public RunType() {
		super();
	}
	public RunType(String runtypeid, String runType) {
		super();
		this.runtypeid = runtypeid;
		this.runType = runType;
	}
	public String getRuntypeid() {
		return runtypeid;
	}
	public void setRuntypeid(String runtypeid) {
		this.runtypeid = runtypeid;
	}
	public String getRunType() {
		return runType;
	}
	public void setRunType(String runType) {
		this.runType = runType;
	}
	@Override
	public String toString() {
		return "RunType [runtypeid=" + runtypeid + ", runType=" + runType + "]";
	}
	
	
}
