package com.example.employeepayrolldto.Service;

import com.example.employeepayrolldto.Dto.EmployeeDto;
import com.example.employeepayrolldto.Model.EmployeeData;
import com.example.employeepayrolldto.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public List<EmployeeData> display() {
        return employeeRepo.findAll();
    }
    public EmployeeData saveAll(EmployeeData employeeData) {
        return employeeRepo.save(employeeData);
    }
}


