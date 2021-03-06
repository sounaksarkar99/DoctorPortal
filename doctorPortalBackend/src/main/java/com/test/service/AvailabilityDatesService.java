package com.test.service;


import com.test.model.AvailabilityDates;
import com.test.repository.AvailabilityDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailabilityDatesService {
    @Autowired
    private AvailabilityDatesRepository availabilityDatesRepository;


    public List<AvailabilityDates> listAll(){
        return availabilityDatesRepository.findAll();
    }

    public AvailabilityDates get(int id){
        return availabilityDatesRepository.findById(id).get();

    }

    public void save(AvailabilityDates availabilityDates){
        availabilityDatesRepository.save(availabilityDates);
    }

    public AvailabilityDates update(AvailabilityDates availabilityDates ){
        return availabilityDatesRepository.save(availabilityDates);
    }

    public void delete(int id){
        availabilityDatesRepository.deleteById(id);
    }
}