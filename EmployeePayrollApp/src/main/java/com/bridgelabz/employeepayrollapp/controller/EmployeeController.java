package com.bridgelabz.employeepayrollapp.controller;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.Service.EmployeeService;
import com.bridgelabz.employeepayrollapp.model.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

}
