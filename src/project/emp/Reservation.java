
package project.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	@Id
	private int id;
	private String vehicle;
	private String date;
	private String time;
	private int cost;

	public Reservation(int id, String vehicle, String date, String time, int cost) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.date = date;
		this.cost = cost;
	}

}