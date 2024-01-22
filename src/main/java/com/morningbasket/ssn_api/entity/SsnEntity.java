package com.morningbasket.ssn_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SSN_TABLE")
public class SsnEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ssnid;
	private String stateName;
	public Integer getSsnid() {
		return ssnid;
	}
	public void setSsnid(Integer ssnid) {
		this.ssnid = ssnid;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Long getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(Long ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	private Long ssnNumber;

}
