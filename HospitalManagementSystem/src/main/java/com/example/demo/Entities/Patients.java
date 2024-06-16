package com.example.demo.Entities;

import com.example.demo.Enum.Gender;
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
@Table(name = "PatientDetails")
public class Patients 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PatientID",length = 100)
	private Integer patientId;

	@Column(name = "PatientName",length = 50)
	private String patientName;

	@Column(name = "PatientAddress", length = 80)
	private String patientAddress;

	@Column(name = "PatientMobileNo",length = 10)
	private Integer patientMobileNo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "PatientGender",length = 10)
	private Gender patientGender;
	
	@Column(name = "PatientAge",length = 10)
	private Integer patientAge;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "PatientStatus",length = 20)
	private Status patientStatus;

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patients(Integer patientId, String patientName, String patientAddress, Integer patientMobileNo,
			Gender patientGender, Integer patientAge, Status patientStatus) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientMobileNo = patientMobileNo;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
		this.patientStatus = patientStatus;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

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

	public Status getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(Status patientStatus) {
		this.patientStatus = patientStatus;
	}
	
	
}
