package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
