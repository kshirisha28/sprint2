package com.cg.goaddress.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.goaddress.entity.Address;

@Repository
public interface AddressDao extends JpaRepository<Address,Integer> {

	

}
