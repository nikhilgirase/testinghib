package pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "iteration_info")
public class IterationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iteration_id")
	private int iterationId;

	@ManyToOne
	@JoinColumn(name = "release_id")
	private ReleaseInfo release;

	@Column(name = "iteration_title")
	private String iterationTitle;

	@Column(name = "iteration_description")
	private String iterationDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "iteration_startdate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date iterationStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "iteration_enddate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date iterationEndDate;

	@Column(name = "iteration_status")
	private String iterationStatus;

	@Column(name = "iteration_type")
	private String iterationType;
	
	@OneToMany(mappedBy = "iteration")
	private List<ItemsInfo> itemInfo;

}
