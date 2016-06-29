package com.evaluation.pojo;

import javax.persistence.*;

@Entity
@Table(name = "employee_roles")
public class EmployeeRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int roleId;

	@Column(name = "role_def")
	private String roleDefinition;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDefinition() {
		return roleDefinition;
	}

	public void setRoleDefinition(String roleDefinition) {
		this.roleDefinition = roleDefinition;
	}

	
}
