package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.PatientDto;
import com.example.demo.Entities.Patients;
import com.example.demo.Enum.Status;
import com.example.demo.Repositary.PatientRepository;
import com.example.demo.Services.PatientServices;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class PatientServiceImpl implements PatientServices
{

	@Autowired
	PatientRepository patientRepository;
	
	
	@Override
	public Patients createPatient(PatientDto patientDto, HttpServletRequest httpServletRequest) 
	{
		Patients patients = new Patients();
		patients.setPatientName(patientDto.getPatientName());
		patients.setPatientAge(patientDto.getPatientAge());
		patients.setPatientAddress(patientDto.getPatientAddress());
		patients.setPatientGender(patientDto.getPatientGender());
		patients.setPatientMobileNo(patientDto.getPatientMobileNo());
		patients.setPatientStatus(Status.Active);
		
		patientRepository.save(patients);
		return null;
	}


	
	@Override
	public List<Patients> displayall() 
	{
		// TODO Auto-generated method stub
		
		List<Patients> patients= patientRepository.findByPatientStatus(Status.Active);
		
		if(patients!=null)
		{	
			return patientRepository.findByPatientStatus(Status.Active);
		}
		else
		{
			throw new IllegalArgumentException("Id not found");
		}

	}



	@Override
	public Patients displaybyid(PatientDto patientDto, Integer id) 
	{
		Patients patients = patientRepository.findByPatientIdAndPatientStatus(id,Status.Active);
		
		if(patients!=null)
		{
			
			if(patients.getPatientStatus()==Status.Active)
			{
				
				return patientRepository.findByPatientIdAndPatientStatus(id,Status.Active);
			}
			else
			{
				throw new IllegalArgumentException("Id not found");	
			}
		}
		else
		{
			throw new IllegalArgumentException("Id not found");
		}
		
		
	}



	@Override
	public void delete(Integer id) 
	{
		Patients patients = patientRepository.findById(id).get();
		
		if(patients!=null)
		{
			patients.setPatientStatus(Status.Inactive);
			patientRepository.save(patients);
		}
		else
		{
			throw new IllegalArgumentException("id not found ");
		}
	}



	@Override
	public Patients updatePatient(PatientDto patientDto, Integer id) 
	{
		// TODO Auto-generated method stub
		
		Patients byid = patientRepository.findById(id).get();
		Patients patients = new Patients();
		
		if(byid!=null)
		{
			byid.setPatientName(patientDto.getPatientName());
			byid.setPatientAge(patientDto.getPatientAge());
			byid.setPatientAddress(patientDto.getPatientAddress());
			byid.setPatientGender(patientDto.getPatientGender());
			byid.setPatientMobileNo(patientDto.getPatientMobileNo());
			byid.setPatientStatus(Status.Active);
			
			patientRepository.save(byid);
			
		}
		else
		{
			throw new IllegalArgumentException("id not found ");
		}
		return null;
	}
	
}
