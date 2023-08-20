package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
}
