package com.example.employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.employeemanagement.model.Employee;

@Repository
public class EmployeeRepository {

    private List<Employee> list = new ArrayList<>();

    public List<Employee> getAll() {
        return list;
    }

    public Employee save(Employee emp) {
        list.add(emp);
        return emp;
    }
}