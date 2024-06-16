package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Entities.Doctor;
import com.example.demo.Enum.Status;
import com.example.demo.Repositary.DoctorRepository;
import com.example.demo.Services.DoctorServices;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class DoctorServiceImpl implements DoctorServices
{
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor createDoctor(DoctorDto doctorDto, HttpServletRequest httpServletRequest) 
	{
		Doctor doctor= new Doctor();
		
		doctor.setDoctorName(doctorDto.getDoctorName());
		doctor.setDoctorAddress(doctorDto.getDoctorAddress());
		doctor.setDoctorAge(doctorDto.getDoctorAge());
		doctor.setDoctorSpecialist(doctorDto.getDoctorSpecialist());
		doctor.setDoctorStatus(Status.Active);
		doctorRepository.save(doctor);
		return null;
	}

	
	@Override
	public List<Doctor> displayDoctor() 
	{
		return doctorRepository.findAll();
	}


	@Override
	public Doctor displaybyid(DoctorDto doctorDto, Integer id) 
	{
		Doctor doctor = doctorRepository.findById(id).get();
		
		if(doctor!=null)
		{
			return doctorRepository.findById(id).get();
		}
		else
		{
			throw new IllegalArgumentException("Id not found");
		}
		
		
	}


	@Override
	public void delete(Integer id) 
	{
		// TODO Auto-generated method stub
		Doctor doctor = doctorRepository.findById(id).get();
		
		if(doctor!=null)
		{
			doctor.setDoctorStatus(Status.Inactive);
			doctorRepository.save(doctor);
		}
		else
		{
			throw new IllegalArgumentException("Id not found ");
		}
	}


	@Override
	public Doctor updatedocDoctor(DoctorDto doctorDto, Integer id) 
	{
		
		Doctor byid = doctorRepository.findById(id).get();
		Doctor doctor = new Doctor();
		if(byid!=null)
		{
			
			byid.setDoctorName(doctorDto.getDoctorName());
			byid.setDoctorAddress(doctorDto.getDoctorAddress());
			byid.setDoctorAge(doctorDto.getDoctorAge());
			byid.setDoctorSpecialist(doctorDto.getDoctorSpecialist());
			byid.setDoctorStatus(Status.Active);
			doctorRepository.save(byid);
		}
		else
		{
			throw new IllegalArgumentException();
		}
		return null;
	}
	
	
}
