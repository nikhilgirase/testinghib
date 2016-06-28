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

	@Column(name = "item_description")
	private String itemDescription;
	
	@Column(name = "item_status")
	private String itemStatus;
	
	@ManyToOne
	@JoinColumn(name = "release_id")
	private ReleaseInfo release;
	
	@ManyToOne
	@JoinColumn(name = "iteration_id")
	private IterationInfo iteration;

}
