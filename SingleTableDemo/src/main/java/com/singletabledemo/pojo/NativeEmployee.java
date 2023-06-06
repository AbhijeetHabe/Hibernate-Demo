package com.singletabledemo.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ne")
public class NativeEmployee extends Employee {

	@Column(name = "ofc_loc")
	private String office_location;

	public NativeEmployee() {
		super();
	}

	public String getOffice_location() {
		return office_location;
	}

	public void setOffice_location(String office_location) {
		this.office_location = office_location;
	}
	
}
