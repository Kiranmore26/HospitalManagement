package com.example.demo.Controller;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Entities.Doctor;
import com.example.demo.Enum.ResponseHandler;
import com.example.demo.Services.DoctorServices;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Doctor")
public class DoctorController 
{
	@Autowired
	DoctorServices doctorServices;
	
	ResponseHandler responseHandler= new ResponseHandler();
	
	@PostMapping("/create")
	public ResponseHandler createDoctor(@RequestBody DoctorDto doctorDto,HttpServletRequest httpServletRequest)
	{
		try
		{
			Doctor doctor = doctorServices.createDoctor(doctorDto, httpServletRequest);
			responseHandler.setStatus(true);
			responseHandler.setMessage("Data Saved Sucessfully");
		}
		catch (Exception e) 
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage("Data not saved");
		}
		
		return responseHandler;
	}
	
	@GetMapping("/display")
	public List<Doctor>  displayDoctor()
	{
		return doctorServices.displayDoctor();
	}
	
	@GetMapping("/byid/{id}")
	public Doctor displaybyid(DoctorDto doctorDto,@PathVariable Integer id)
	{
		return doctorServices.displaybyid(doctorDto, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseHandler delete(@PathVariable Integer id)
	{
		try
		{
			doctorServices.delete(id);
			responseHandler.setStatus(true);
			responseHandler.setMessage("Data Deleted Sucessfully");
		}
		catch (Exception e) 
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage("Data not Deleted amd saved");
		}
		return responseHandler;
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseHandler update(@RequestBody DoctorDto doctorDto,@PathVariable Integer id)
	{
		
		try
		{
			doctorServices.updatedocDoctor(doctorDto, id);
			responseHandler.setStatus(true);
			responseHandler.setMessage("Data Deleted Sucessfully");
		}
		catch (Exception e) 
		{
			responseHandler.setStatus(false);
			responseHandler.setMessage("Data not Deleted amd saved");
		}
		return responseHandler;
	
		
	}
	
}
