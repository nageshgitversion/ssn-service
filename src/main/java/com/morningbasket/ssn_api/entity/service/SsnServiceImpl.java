package com.morningbasket.ssn_api.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningbasket.ssn_api.entity.SsnEntity;
import com.morningbasket.ssn_api.repository.SsnRepository;

@Service
public class SsnServiceImpl implements SsnService{
	
	
	@Autowired
	private SsnRepository ssnRepo;
	
	
	

	@Override
	public String getStateBySsn(Long ssnNumber) {
		SsnEntity entity = ssnRepo.findBySsnNumber(ssnNumber);
		
		String state = entity.getStateName();
		
		
		
		
		return state;
	}




	@Override
	public boolean saveSsn(SsnEntity entity) {
	     SsnEntity save = ssnRepo.save(entity);
		return save.getSsnid()!=null;
	}

}
