package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the about_us database table.
 * 
 */
@Entity
@Table(name="about_us")
@NamedQuery(name="AboutUs.findAll", query="SELECT a FROM AboutUs a")
public class AboutUs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="about_us_id")
	private int aboutUsId;

	@Temporal(TemporalType.DATE)
	@Column(name="creation_date")
	private Date creationDate;

	private String description;

	private String image;

	private String name;

	private String slogan;

	public AboutUs() {
	}

	public int getAboutUsId() {
		return this.aboutUsId;
	}

	public void setAboutUsId(int aboutUsId) {
		this.aboutUsId = aboutUsId;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlogan() {
		return this.slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}