package com.tableperclassdemo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fourwheeler")
public class FourWheeler extends Vehicle {

	@Column(name ="steering")
	private String steering_type;
	
	public FourWheeler() {
	}

	public String getSteering_type() {
		return steering_type;
	}

	public void setSteering_type(String steering_type) {
		this.steering_type = steering_type;
	}
	
	
}
