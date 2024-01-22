package com.morningbasket.ssn_api.entity.service;

import com.morningbasket.ssn_api.entity.SsnEntity;

public interface SsnService {
	
	public String getStateBySsn(Long ssnNumber);
	
	public boolean saveSsn(SsnEntity entity);

}
