package pojo;

import java.util.List;

import javax.persistence.*;

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
	private Employee employee;
	
	@OneToMany(mappedBy = "project")
	private List<ReleaseInfo> releaseInfo;

}
