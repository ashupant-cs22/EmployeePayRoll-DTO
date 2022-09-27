package com.example.employeepayrolldto.Service;

import com.example.employeepayrolldto.Dto.EmployeeDto;

public interface IEmployeeService {

    Object save(EmployeeDto employeeDto);

    Object displayAll(EmployeeDto employeeDto);

    Object findById(EmployeeDto employeeDto);

    Object delete(EmployeeDto employeeDto);

}
