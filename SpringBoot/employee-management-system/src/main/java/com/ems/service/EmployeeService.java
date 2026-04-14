package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee addEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found: " + id));
    }

    public Employee updateEmployee(Long id, Employee newEmp) {
        Employee old = getEmployeeById(id);

        old.setName(newEmp.getName());
        old.setEmail(newEmp.getEmail());
        old.setDepartment(newEmp.getDepartment());
        old.setSalary(newEmp.getSalary());

        return repo.save(old);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}