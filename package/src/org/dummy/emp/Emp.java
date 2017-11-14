package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Details")
public class Emp {

	public Emp( String name, String emailId, long phone) {	
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	@Id
	@GeneratedValue
	@Column(name = "Emp_Id")
	private int id;
	@Column(name = "Emp_name", length = 150, nullable = false)
	private String name;
	@Column(name = "Emp_mail_id", nullable = false, length = 150)
	private String emailId;
	@Column(name = "Emp_phno", length = 10)
	private long phone;
	@Column(name = "Basic_Salary")
	private double basicSalary;
	@Column(name = "DA", nullable = false, precision = 2)
	private double dearnessAllowance;
	@Column(name = "HRA", precision = 2)
	private double houseREntAllowance;
	@Column(name = "TA", precision = 2)
	private double travelAllowance;
	@Transient
	private double netSalary;


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
