package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.test.repository.AdminRepository;
import com.test.model.Admin;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> listAll(){
        return adminRepository.findAll();
    }

    public Admin get(int id){
        return adminRepository.findById(id).get();

    }

    public void save(Admin admin){
        adminRepository.save(admin);
    }

    public Admin update(Admin admin){
        return adminRepository.save(admin);
    }

    public void delete(int id){
        adminRepository.deleteById(id);
    }
}

