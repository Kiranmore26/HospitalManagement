package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.demo.Dto.PatientDto;
import com.example.demo.Entities.Patients;
import com.example.demo.Enum.ResponseHandler;
import com.example.demo.Services.PatientServices;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Patient")
public class PatientController 
{
	@Autowired
	PatientServices patientServices;
	
	ResponseHandler responseHandler = new ResponseHandler();
	
	
	@PostMapping("/create")
	public ResponseHandler  createPatientr( @RequestBody PatientDto patientDto,HttpServletRequest httpServletRequest) 
	{
		
		try 
		{
			Patients patient = patientServices.createPatient(patientDto, httpServletRequest);
			responseHandler.setMessage("Data Saved Sucessfully");
			responseHandler.setStatus(true);
		} 
		catch (Exception e) 
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage(e.getMessage());
		}
		
		return responseHandler;
	}
	
	
	@GetMapping("/displayall")
	public List<Patients>  displayAllPatients()
	{
		return patientServices.displayall();
	}
	
	
	@GetMapping("/byid/{id}")
	public Patients displayByID(PatientDto patientDto,@PathVariable Integer id) 
	{
		return patientServices.displaybyid(patientDto, id);
	}
	
	
	@DeleteMapping("/de/{id}")
	public ResponseHandler deletePatient(@PathVariable("id") Integer id) 
	{
		try
		{
			patientServices.delete(id);
			responseHandler.setStatus(true);
			responseHandler.setMessage("Data Deleted Sucessfully");
		}
		catch(IllegalArgumentException e)
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage(e.getMessage());
		}
		 return responseHandler;
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseHandler updatePatient(@RequestBody PatientDto patientDto,@PathVariable Integer id) 
	{
		try
		{
			Patients updatePatient = patientServices.updatePatient(patientDto, id);
			responseHandler.setStatus(true);
			responseHandler.setMessage("Data Updated Sucessfully");
		}
		catch(IllegalArgumentException e)
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage(e.getMessage());
		}
		 return responseHandler;
	}

}
