package com.example.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", service.getAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(Employee emp) {
        service.addEmployee(emp);
        return "redirect:/";
    }
}