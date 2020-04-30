package com.cg.goaddress.service;

import java.util.List;

import com.cg.goaddress.entity.Address;
import com.cg.goaddress.entity.Retailer;
import com.cg.goaddress.exception.AddressException;


public interface AddressService {


public Address  findAllAddressId(int addressId) throws AddressException;
	
	public Address createAddress(Address address) throws AddressException;
	
	public List<Address>  findAllAddress() throws AddressException;
	
	public Address deleteAddressById(int addressId) throws AddressException;

//
	 public Address update(int addressId) throws AddressException;
 //
	//public List<Retailer> findRetailerById() throws AddressException;

	public List<Retailer> findAllRetailer();

	//List<Retailer> findRetailerById(int id) throws AddressException;

//	public List<Address> findRetailerById(int id);
}
