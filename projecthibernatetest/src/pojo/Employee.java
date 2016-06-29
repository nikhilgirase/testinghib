package pojo;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "employee_fname")
	private String employeeFname;

	@Column(name = "employee_lname")
	private String employeeLname;

	@Column(name = "employee_designation")
	private String employeeDesignation;
	
	@Column(name = "employee_username")
	private String employeeUsername;
	
	@Column(name = "employee_password")
	private String employeePassword;

	@OneToOne
	@JoinColumn(name = "role_id")
	private EmployeeRoles employeeRoleId;
	
	@OneToMany(mappedBy = "employee")
	private List<ProjectInfo> project;
	
	@OneToMany(mappedBy = "projemployee")
	private List<ReleaseInfo> projEpmInfo;

}
