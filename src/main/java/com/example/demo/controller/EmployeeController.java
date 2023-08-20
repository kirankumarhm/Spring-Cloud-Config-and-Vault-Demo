package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> firstPage() {

        return empService.getAllEmployees();

    }
}
