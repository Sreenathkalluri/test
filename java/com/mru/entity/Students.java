package com.mru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private int id;
	private String name;
	private String branch;
	private String emial;
	private String mobileno ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", branch=" + branch + ", email=" + emial + ", mobile no=" + mobileno
				+ "]";
	}
	public Students() {
		super();
	}
	public Students(int id,String name,String branch,String emial,String mobileno) {
		super();
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.emial=emial;
		this.mobileno=mobileno;
		
	}
}
