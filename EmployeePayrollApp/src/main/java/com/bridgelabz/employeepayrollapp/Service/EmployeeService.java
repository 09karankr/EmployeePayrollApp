package com.bridgelabz.employeepayrollapp.Service;


import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // ✅ Add Employee
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(0, employeeDTO); // Set ID to 0 for new employee
        return employeeRepository.save(employee);
    }

    // ✅ Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // ✅ Get Employee by ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById((long) id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

}