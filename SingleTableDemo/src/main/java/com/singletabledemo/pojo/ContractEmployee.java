package com.singletabledemo.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ce")
public class ContractEmployee extends Employee {

	@Column(name = "site_loc")
	private String site_location;

	public ContractEmployee() {
		super();
	}

	public String getSite_location() {
		return site_location;
	}

	public void setSite_location(String site_location) {
		this.site_location = site_location;
	}
	
}
