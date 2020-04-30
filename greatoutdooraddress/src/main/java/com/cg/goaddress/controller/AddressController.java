package com.cg.goaddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.goaddress.entity.Address;
import com.cg.goaddress.entity.Retailer;
import com.cg.goaddress.exception.AddressException;
import com.cg.goaddress.service.AddressService;





@RestController
@CrossOrigin("*")
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("address/{id}/retailer/{id}")
	public ResponseEntity<Address> createAddress(@RequestBody Address address) throws AddressException
	{
		Address addr =addressService.createAddress(address);
		ResponseEntity<Address>  re = new ResponseEntity<Address>(addr,HttpStatus.OK);

		return re;
	}
	//
	@PutMapping("address/{id}")
	public ResponseEntity<Address> get(@PathVariable("id")int id) throws AddressException	{	
		Address adss=addressService.findAllAddressId(id);
		ResponseEntity<Address> dress =new ResponseEntity<>(adss,HttpStatus.OK);
		return dress;
	}	
//
	

	@GetMapping("address/{id}")
	public ResponseEntity<Address> findAllAddressId(@PathVariable("id")  int id) throws AddressException 
	{
		Address  addresses = addressService.findAllAddressId(id);
		   ResponseEntity<Address>  tr = new ResponseEntity<>(addresses,HttpStatus.OK);
		   return tr;
		
	}


	@GetMapping("address")
	public ResponseEntity<List<Address>> findAllAddress() throws AddressException
	{
		List<Address> list = addressService.findAllAddress();
		ResponseEntity<List<Address>>  rt = new ResponseEntity<List<Address>>(list,HttpStatus.OK);
		return rt;
			}
	@GetMapping("retailer")
	public ResponseEntity<List<Retailer>> findAllRetailer() throws AddressException
	{
		List<Retailer> list = addressService.findAllRetailer();
		ResponseEntity<List<Retailer>>  rt = new ResponseEntity<List<Retailer>>(list,HttpStatus.OK);
		return rt;
			}
//	@GetMapping("retailer/{id}")
//	public ResponseEntity<Address> findAllRetailerId(@PathVariable("id")  int id) throws AddressException 
//	{
//		Address  addresses = addressService.findAllAddressId(id);
//		   ResponseEntity<Address>  tr = new ResponseEntity<>(addresses,HttpStatus.OK);
//		   return tr;
//		
//	}

	
	@DeleteMapping("address/{id}")
	public ResponseEntity<Address> deleteAddressById(@PathVariable("id") int addressId) throws AddressException
	{

		ResponseEntity<Address>  rt = null;
		
		
		Address re = addressService.deleteAddressById(addressId);
		rt= new ResponseEntity<Address>(re,HttpStatus.OK);
		
		return rt;
	}
	}

