package project.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {

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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Id
	private int id;
	private String name;
	private String emailid;
	private long phone;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String name, String emailid, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
	}

}
