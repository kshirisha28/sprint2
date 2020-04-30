package com.cg.goaddress.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="retailer_tbl")
public class Retailer {

	@Id
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mygen",sequenceName="retailerId_seq",allocationSize=1)
	@Column(name="retailer_id")
	private int retailerId;
	
	@Column(name="retailername",length=15)
	private String retailerName;

	
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id")
    @JsonIgnore
  
	private Address address;



	public int getRetailerId() {
		return retailerId;
	}



	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}



	public String getRetailerName() {
		return retailerName;
	}



	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
	




		
	
}
