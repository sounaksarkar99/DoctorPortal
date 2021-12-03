package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.AvailabilityDates;



@Repository
public interface AvailabilityDatesRepository extends JpaRepository<AvailabilityDates, Integer> {


}
