package com.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	private int tid;
	private String tname;
	private String tassignTo;
	/*
	public Task(int tid, String tname, String tassignTo) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tassignTo = tassignTo;
	}
	*/
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTassignTo() {
		return tassignTo;
	}
	public void setTassignTo(String tassignTo) {
		this.tassignTo = tassignTo;
	}
	
	
}
