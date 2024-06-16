package com.example.demo.Entities;

import com.example.demo.Enum.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctordetails")
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DoctorId")
	private Integer doctorId;
	
	@Column(name = "DoctorName")
	private String doctorName;
	
	@Column(name = "DoctorAddress")
	private String doctorAddress;
	
	@Column(name = "DoctorAge")
	private Integer doctorAge;
	
	@Column(name = "DoctorSpecialist")
	private String doctorSpecialist;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "DoctorStatus")
	private Status doctorStatus;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer doctorId, String doctorName, String doctorAddress, Integer doctorAge, String doctorSpecialist,
			Status doctorStatus) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorAge = doctorAge;
		this.doctorSpecialist = doctorSpecialist;
		this.doctorStatus = doctorStatus;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

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

	public Status getDoctorStatus() {
		return doctorStatus;
	}

	public void setDoctorStatus(Status doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	
	
}
