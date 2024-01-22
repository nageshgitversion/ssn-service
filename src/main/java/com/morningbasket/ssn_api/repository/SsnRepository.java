package com.morningbasket.ssn_api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.morningbasket.ssn_api.entity.SsnEntity;

@Repository
public interface SsnRepository extends JpaRepository<SsnEntity, Serializable>{
	
	
	
	public SsnEntity findBySsnNumber(Long ssnNumber);

}
