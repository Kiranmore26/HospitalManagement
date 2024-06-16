package com.example.demo.Dto;

import jakarta.persistence.Column;

public class DoctorDto 
{
	private String doctorName;
	
	
	private String doctorAddress;
	

	private Integer doctorAge;
	
	
	private String doctorSpecialist;


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDoctorAddress() {
		return doctorAddress;
	}


	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}


	public Integer getDoctorAge() {
		return doctorAge;
	}


	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}


	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}


	public void setDoctorSpecialist(String doctorSpecialist) {
		this.doctorSpecialist = doctorSpecialist;
	}


	 
}
