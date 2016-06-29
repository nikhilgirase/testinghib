package pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "release_info")
public class ReleaseInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "release_id")
	private int releaseId;

	@ManyToOne
	@JoinColumn(name = "release_project", referencedColumnName = "project_id")
	private ProjectInfo project;

	@Column(name = "release_title")
	private String releaseTitle;

	@Column(name = "release_description", columnDefinition = "VARCHAR(1024)")
	private String releaseDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "release_startdate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date releaseStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "release_planneddate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date releasePlanneDdate;

	@Temporal(TemporalType.DATE)
	@Column(name = "release_actualreleasedate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date releaseReleaseDate;

	@Column(name = "release_type")
	private String releaseType;

	@Column(name = "release_under")
	private String releaseTo;

	@Column(name = "release_status")
	private String releaseStatus;

	@ManyToOne
	@JoinColumn(name = "release_manager", referencedColumnName = "employee_id")
	private Employee projemployee;

	@Column(name = "release_version")
	private String releaseVersion;

	@OneToMany(mappedBy = "release")
	private List<IterationInfo> iterationInfo;
	
	@OneToMany(mappedBy = "release")
	private List<ItemsInfo> itemInfo;

}
