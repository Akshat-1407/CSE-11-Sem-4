package com.example.employee_crud_api.service;
import com.example.employee_crud_api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    // CREATE
    public Employee addEmployee(Employee emp) {
        employeeMap.put(emp.getId(), emp);
        return emp;
    }

    // READ ALL
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    // READ BY ID
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    // UPDATE
    public Employee updateEmployee(int id, Employee emp) {
        if (employeeMap.containsKey(id)) {
            employeeMap.put(id, emp);
            return emp;
        }
        return null;
    }

    // DELETE
    public String deleteEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            return "Employee deleted successfully";
        }
        return "Employee not found";
    }
}