package org.auto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {
	private String steeringWheel;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
}
