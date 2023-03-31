package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contact_information database table.
 * 
 */
@Entity
@Table(name="contact_information")
@NamedQuery(name="ContactInformation.findAll", query="SELECT c FROM ContactInformation c")
public class ContactInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="contact_id")
	private int contactId;

	private String city;

	private String email;

	@Column(name="phone_number")
	private int phoneNumber;

	@Column(name="time_closed")
	private String timeClosed;

	@Column(name="time_open")
	private String timeOpen;

	public ContactInformation() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTimeClosed() {
		return this.timeClosed;
	}

	public void setTimeClosed(String timeClosed) {
		this.timeClosed = timeClosed;
	}

	public String getTimeOpen() {
		return this.timeOpen;
	}

	public void setTimeOpen(String timeOpen) {
		this.timeOpen = timeOpen;
	}

}