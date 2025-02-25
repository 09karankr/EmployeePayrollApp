package com.bridgelabz.employeepayrollapp.controller;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @PutMapping("/{index}")
    public EmployeeDTO updateEmployee(@PathVariable int index, @RequestBody EmployeeDTO employeeDTO) {
        return employeeService.updateEmployee(index, employeeDTO);
    }

    @DeleteMapping("/{index}")
    public String deleteEmployee(@PathVariable int index) {
        return employeeService.deleteEmployee(index) ? "Employee deleted" : "Invalid index";
    }
}
