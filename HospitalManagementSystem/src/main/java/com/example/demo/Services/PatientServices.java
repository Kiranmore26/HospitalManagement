package com.example.demo.Services;

import java.util.List;

import com.example.demo.Dto.PatientDto;
import com.example.demo.Entities.Patients;

import jakarta.servlet.http.HttpServletRequest;

public interface PatientServices 
{
	public Patients createPatient(PatientDto patientDto,HttpServletRequest httpServletRequest);
	
	public List<Patients> displayall();
	
	public Patients displaybyid(PatientDto patientDto,Integer id);
	
	public void delete(Integer id);
	
	public Patients updatePatient(PatientDto patientDto,Integer id);
	
}
