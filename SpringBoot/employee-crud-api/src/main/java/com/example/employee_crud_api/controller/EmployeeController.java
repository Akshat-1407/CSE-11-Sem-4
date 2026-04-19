package com.example.employee_crud_api.controller;

import com.example.employee_crud_api.model.EmployeeModel;
import com.example.employee_crud_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // CREATE
    @PostMapping
    public EmployeeModel createEmployee(@RequestBody EmployeeModel emp) {
        return service.addEmployee(emp);
    }

    // READ ALL
    @GetMapping
    public List<EmployeeModel> getAllEmployees() {
        return service.getAllEmployees();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public EmployeeModel getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public EmployeeModel updateEmployee(@PathVariable int id,
                                   @RequestBody EmployeeModel emp) {
        return service.updateEmployee(id, emp);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}