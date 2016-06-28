package pojo;

import java.util.Date;

import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "release_info")
public class ReleaseInfo {

	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userDetailId")
	private Long userId;
	
	@Column(name = "user_email", unique = true)
	private String userEmail;
	
	@Column(name = "user_addr")
	private String userAddr;
	
	@Column(name = "user_approve_status")
	private int userApproveStatus;
	
	@Column(name = "user_city")
	private String userCity;
	
	@Column(name = "user_country")
	private String userCountry;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "user_dob")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date userDob;
	
	@Column(name = "user_fname")
	private String userFname;
	
	@Column(name = "user_lname")
	private String userLname;
	
	@Column(name = "user_mobile")
	private String userMobile;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name = "user_state")
	private String userState;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eventId")
	private List<EventsDetail> eventsDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postId")
	private List<PostDetail> postDetails;

	@Column(name = "loginType")
	private String loginType;
	 */
	
	/** The release id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "release_id")
	private int release_id;
	
	/** The release title. */
	@Column(name = "release_title")
	private String release_title;
	
	/** The release description. */
	@Column(name = "release_description")
	private String release_description;
	
	/** The release startdate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "release_startdate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date release_startdate;
	
	/** The release planneddate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "release_planneddate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date release_planneddate;
	
	/** The release releasedate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "release_releasedate")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date release_releasedate;
	
	/** The release type. */
	@Column(name = "release_type")
	private String release_type;
	
	/** The release to. */
	@Column(name = "release_under")
	private String release_to;
	
	/** The release status. */
	@Column(name = "release_status")
	private String release_status;
	
	/** The release manager. */
	@Column(name = "release_manager")
	private String release_manager;
	
	/** The release version. */
	@Column(name = "release_version")
	private String release_version;

	/**
	 * @return the release_id
	 */
	public int getRelease_id() {
		return release_id;
	}

	/**
	 * @param release_id the release_id to set
	 */
	public void setRelease_id(int release_id) {
		this.release_id = release_id;
	}

	/**
	 * @return the release_title
	 */
	public String getRelease_title() {
		return release_title;
	}

	/**
	 * @param release_title the release_title to set
	 */
	public void setRelease_title(String release_title) {
		this.release_title = release_title;
	}

	/**
	 * @return the release_description
	 */
	public String getRelease_description() {
		return release_description;
	}

	/**
	 * @param release_description the release_description to set
	 */
	public void setRelease_description(String release_description) {
		this.release_description = release_description;
	}

	/**
	 * @return the release_startdate
	 */
	public Date getRelease_startdate() {
		return release_startdate;
	}

	/**
	 * @param release_startdate the release_startdate to set
	 */
	public void setRelease_startdate(Date release_startdate) {
		this.release_startdate = release_startdate;
	}

	/**
	 * @return the release_planneddate
	 */
	public Date getRelease_planneddate() {
		return release_planneddate;
	}

	/**
	 * @param release_planneddate the release_planneddate to set
	 */
	public void setRelease_planneddate(Date release_planneddate) {
		this.release_planneddate = release_planneddate;
	}

	/**
	 * @return the release_releasedate
	 */
	public Date getRelease_releasedate() {
		return release_releasedate;
	}

	/**
	 * @param release_releasedate the release_releasedate to set
	 */
	public void setRelease_releasedate(Date release_releasedate) {
		this.release_releasedate = release_releasedate;
	}

	/**
	 * @return the release_type
	 */
	public String getRelease_type() {
		return release_type;
	}

	/**
	 * @param release_type the release_type to set
	 */
	public void setRelease_type(String release_type) {
		this.release_type = release_type;
	}

	/**
	 * @return the release_to
	 */
	public String getRelease_to() {
		return release_to;
	}

	/**
	 * @param release_to the release_to to set
	 */
	public void setRelease_to(String release_to) {
		this.release_to = release_to;
	}

	/**
	 * @return the release_status
	 */
	public String getRelease_status() {
		return release_status;
	}

	/**
	 * @param release_status the release_status to set
	 */
	public void setRelease_status(String release_status) {
		this.release_status = release_status;
	}

	/**
	 * @return the release_manager
	 */
	public String getRelease_manager() {
		return release_manager;
	}

	/**
	 * @param release_manager the release_manager to set
	 */
	public void setRelease_manager(String release_manager) {
		this.release_manager = release_manager;
	}

	/**
	 * @return the release_version
	 */
	public String getRelease_version() {
		return release_version;
	}

	/**
	 * @param release_version the release_version to set
	 */
	public void setRelease_version(String release_version) {
		this.release_version = release_version;
	}

}
