package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
