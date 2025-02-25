package com.bridgelabz.employeepayrollapp.controller;





import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
// yes
@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend access
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // GET: Retrieve an employee by ID
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    // POST: Create a new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // PUT: Update an existing employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeRepository.findById(id).map(emp -> {
            emp.setName(employeeDetails.getName());
            emp.setDepartment(employeeDetails.getDepartment());
            emp.setSalary(employeeDetails.getSalary());
            return employeeRepository.save(emp);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    // DELETE: Remove an employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
