package com.cg.goaddress.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Address_tbl")
public class Address {

	@Id
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mygen",sequenceName="Address_seq",allocationSize=1)
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="adoor",length=15)
	private String addressDoor;
	
	@Column(name="acity",length=15)
    private String addressCity;
	
	@Column(name="astate",length=15)
	private String addressState;

	@Column(name="azip",length=15)
	private String addressZip;
	
	@OneToMany(mappedBy="address",cascade=CascadeType.ALL)
		private List<Retailer> retailer=new ArrayList<>();

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressDoor() {
		return addressDoor;
	}

	public void setAddressDoor(String addressDoor) {
		this.addressDoor = addressDoor;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public List<Retailer> getRetailer() {
		return retailer;
	}

	public void setRetailer(List<Retailer> retailer) {
		this.retailer = retailer;
	}

	
	
}


