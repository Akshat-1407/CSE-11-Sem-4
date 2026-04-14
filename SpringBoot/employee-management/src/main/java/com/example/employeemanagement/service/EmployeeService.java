package com.example.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeemanagement.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee emp) {
        list.add(emp);
        System.out.println(list); 
    }

    public List<Employee> getAll() {
        return list;
    }
}