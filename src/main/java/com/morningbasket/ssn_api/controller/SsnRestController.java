package com.morningbasket.ssn_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.morningbasket.ssn_api.entity.SsnEntity;
import com.morningbasket.ssn_api.entity.service.SsnService;

@RestController
public class SsnRestController {
	
	
	@Autowired
	private SsnService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveSsn(@RequestBody SsnEntity entity){
		
		boolean issave = service.saveSsn(entity);
		
		if(issave) {
			return new ResponseEntity<> ("Data Saved Successfully",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<> ("Data not Saved",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@GetMapping("/ssn/{ssnNumber}")
	public String getStateName(@PathVariable Long ssnNumber) {
		String state = service.getStateBySsn(ssnNumber);
		
		return state;
	}

}
