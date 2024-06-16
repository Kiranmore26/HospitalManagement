package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>
{

}
