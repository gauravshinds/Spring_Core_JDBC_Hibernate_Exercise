package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@Column(name="Project_Id")
	private int pid;
	
	@Column(name = "Project_Name")
	private String name;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee> emp;

	public Project(int pid, String name, List<Employee> emp) {
		super();
		this.pid = pid;
		this.name = name;
		this.emp = emp;
	}

	

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	

	
}
