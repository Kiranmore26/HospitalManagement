package com.example.demo.Services;

import java.util.List;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Entities.Doctor;

import jakarta.servlet.http.HttpServletRequest;

public interface DoctorServices 
{
	 public	Doctor createDoctor(DoctorDto doctorDto,HttpServletRequest httpServletRequest);
	 
	 public List<Doctor> displayDoctor();
	 
	 public Doctor displaybyid(DoctorDto doctorDto,Integer id);
	 
	 public void delete(Integer id);
	 
	 public Doctor updatedocDoctor(DoctorDto doctorDto,Integer id); 
}
