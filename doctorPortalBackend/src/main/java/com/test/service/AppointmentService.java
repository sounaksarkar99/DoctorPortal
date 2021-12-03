package com.test.service;


import com.test.model.Appointment;
import com.test.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> listAll(){
        return appointmentRepository.findAll();
    }

    public Appointment get(int id){
        return appointmentRepository.findById(id).get();

    }

    public void save(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public Appointment update(Appointment appointment ){
        return appointmentRepository.save(appointment);
    }

    public void delete(int id){
        appointmentRepository.deleteById(id);
    }

}