package com.tableperclassdemo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="twowheeler")
public class TwoWheeler extends Vehicle {

	@Column(name="handle")
	private String handle_type;
	
	public TwoWheeler() {
	}

	public String getHandle_type() {
		return handle_type;
	}

	public void setHandle_type(String handle_type) {
		this.handle_type = handle_type;
	}
	
	
}
