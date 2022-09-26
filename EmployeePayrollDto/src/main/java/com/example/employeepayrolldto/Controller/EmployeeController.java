package com.example.employeepayrolldto.Controller;

import com.example.employeepayrolldto.Dto.EmployeeDto;
import com.example.employeepayrolldto.Dto.ResponseDto;
import com.example.employeepayrolldto.Model.EmployeeData;
import com.example.employeepayrolldto.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save(@RequestBody EmployeeDto employeeDto) {
        EmployeeData employeeData = new EmployeeData(employeeDto);
        ResponseDto responseDto = new ResponseDto("Data is been saved", employeeService.saveAll(employeeData));
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("/data")
    public ResponseEntity<ResponseDto> displayAll() {
        ResponseDto responseDto = new ResponseDto("Data is been displayed", employeeService.display());
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
}

