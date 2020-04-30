package com.cg.goaddress.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.goaddress.entity.Retailer;


@Repository
public interface RetailerDao extends JpaRepository<Retailer,Integer>
{ 

}
