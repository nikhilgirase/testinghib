package com.evaluation.pojo;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "project_info")
public class ProjectInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_title")
	private String projectTitle;

	@Column(name = "project_description", columnDefinition = "VARCHAR(1024)")
	private String projectDecription;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	//@JsonBackReference("project_info")
	@JsonIgnore
	private Employee employee;
	
	@OneToMany(mappedBy = "project",fetch=FetchType.EAGER)
	//@JsonManagedReference("release_info")
	@JsonIgnore
	private List<ReleaseInfo> releaseInfo;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDecription() {
		return projectDecription;
	}

	public void setProjectDecription(String projectDecription) {
		this.projectDecription = projectDecription;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<ReleaseInfo> getReleaseInfo() {
		return releaseInfo;
	}

	public void setReleaseInfo(List<ReleaseInfo> releaseInfo) {
		this.releaseInfo = releaseInfo;
	}

}
