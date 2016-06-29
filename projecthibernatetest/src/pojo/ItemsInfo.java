package pojo;

import javax.persistence.*;

@Entity
@Table(name = "item_info")
public class ItemsInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "item_title")
	private String itemTitle;

	@Column(name = "item_description", columnDefinition = "VARCHAR(1024)")
	private String itemDescription;
	
	@Column(name = "item_status")
	private int itemStatus;
	
	@ManyToOne
	@JoinColumn(name = "item_for_release", referencedColumnName = "release_id")
	private ReleaseInfo release;
	
	@ManyToOne
	@JoinColumn(name = "item_for_iteration",referencedColumnName = "iteration_id")
	private IterationInfo iteration;

}
