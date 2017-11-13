package org.dummy.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	public Emp(int id, String name, String emailId, long phone) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	@Id
	private int id;
	private String name, emailId;
	private long phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}


}
