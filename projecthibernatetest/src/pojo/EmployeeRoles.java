package pojo;

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

}
