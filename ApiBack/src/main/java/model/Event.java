package model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="event_id")
	private int eventId;

	private String body;

	@Temporal(TemporalType.DATE)
	@Column(name="creation_date")
	private Date creationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="event_date")
	private Date eventDate;

	@Column(name="event_hour")
	private Time eventHour;

	private String image;

	private String location;

	private String title;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;

	public Event() {
	}

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Time getEventHour() {
		return this.eventHour;
	}

	public void setEventHour(Time eventHour) {
		this.eventHour = eventHour;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}