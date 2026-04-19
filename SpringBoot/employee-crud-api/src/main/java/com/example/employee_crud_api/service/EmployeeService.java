package com.example.employee_crud_api.service;
import com.example.employee_crud_api.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private Map<Integer, EmployeeModel> employeeMap = new HashMap<>();

    // CREATE
    public EmployeeModel addEmployee(EmployeeModel emp) {
        employeeMap.put(emp.getId(), emp);
        return emp;
    }

    // READ ALL
    public List<EmployeeModel> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    // READ BY ID
    public EmployeeModel getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    // UPDATE
    public EmployeeModel updateEmployee(int id, EmployeeModel emp) {
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