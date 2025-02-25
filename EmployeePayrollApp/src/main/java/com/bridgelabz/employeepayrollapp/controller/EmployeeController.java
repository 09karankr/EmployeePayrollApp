package com.bridgelabz.employeepayrollapp.controller;



import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
class EmployeePayrollController {

    private List<Employee> employeeList = new ArrayList<>();

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId( (employeeList.size() + 1));
        employeeList.add(employee);
        return employee;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }
}