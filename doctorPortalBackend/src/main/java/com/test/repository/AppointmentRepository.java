package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
