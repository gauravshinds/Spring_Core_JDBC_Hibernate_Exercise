package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@Column(name="Project_Id")
	private int id;
	@Column(name="Project_Name")
	private String name;
	
	@ManyToMany
	@JoinTable(name="Emp_Project", joinColumns = {@JoinColumn(name="EMP_ID")}, inverseJoinColumns = {@JoinColumn(name="PR_ID")})
	private List<Project> project;

	public Employee(int id, String name, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}

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

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
