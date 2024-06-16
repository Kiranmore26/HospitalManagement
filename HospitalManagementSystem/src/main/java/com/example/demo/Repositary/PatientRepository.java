package com.example.demo.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Patients;
import com.example.demo.Enum.Status;

public interface PatientRepository extends JpaRepository<Patients, Integer>
{

	List<Patients> findByPatientStatus(Status active);

	Patients findByPatientIdAndPatientStatus(Integer id, Status active);

	

}
