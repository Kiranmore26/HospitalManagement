package com.example.demo.Dto;

import com.example.demo.Enum.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PatientDto 
{
	private String patientName;

	private String patientAddress;

	private Integer patientMobileNo;
	
	private Gender patientGender;
	
	private Integer patientAge;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public Integer getPatientMobileNo() {
		return patientMobileNo;
	}

	public void setPatientMobileNo(Integer patientMobileNo) {
		this.patientMobileNo = patientMobileNo;
	}

	public Gender getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(Gender patientGender) {
		this.patientGender = patientGender;
	}

	public Integer getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	
	
	
}
