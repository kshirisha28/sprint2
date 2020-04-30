package com.cg.goaddress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.goaddress.dao.AddressDao;
import com.cg.goaddress.dao.RetailerDao;
import com.cg.goaddress.entity.Address;
import com.cg.goaddress.entity.Retailer;
import com.cg.goaddress.exception.AddressException;



@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressDao addressdao;

	@Autowired
	RetailerDao retailerdao;

	
	@Override
	public Address findAllAddressId(int addressId) throws AddressException {
		Address address=null;
		boolean flag=addressdao.existsById(addressId);
		
		if(flag)
		{
		
		   address=addressdao.findById(addressId).get();

		}
		else
		{
			throw new AddressException("id does not found");
		}
		
		
		 return address;
	}

	@Override
	public Address createAddress(Address address) throws AddressException {
     Address ads=addressdao.saveAndFlush(address);
		

		return ads;
	}

	@Override
	public List<Address> findAllAddress() throws AddressException {
		 List<Address> list=addressdao.findAll();
			
			return list;
	
	}

	@Override
	public Address deleteAddressById(int addressId) throws AddressException {
		Address ads=null;
		if(addressdao.existsById(addressId))
		{
			ads=addressdao.findById(addressId).get();
			addressdao.deleteById(addressId);
			
		}
		else
		{
			throw new AddressException("Id not found");
		}
		return ads;
	}
//
	@Override
	public Address update(int addressId) throws AddressException {
	Address address=addressdao.findById(addressId).get();
		
		address.setAddressId(address.getAddressId());
		   addressdao.saveAndFlush(address);
		   return address;

		
	}
//
	
		
	

	@Override
	public List<Retailer> findAllRetailer() {
		 List<Retailer> list=retailerdao.findAll();
			
			return list;
	
	}


	
	}

		
	
