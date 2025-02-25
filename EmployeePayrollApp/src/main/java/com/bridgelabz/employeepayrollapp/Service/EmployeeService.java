package com.bridgelabz.employeepayrollapp.Service;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<EmployeeDTO> employeeList = new ArrayList<>(); // In-Memory Storage

    public List<EmployeeDTO> getAllEmployees() {
        return employeeList; // Return all employees
    }

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        employeeList.add(employeeDTO); // Add employee to in-memory list
        return employeeDTO; // Return the added employee
    }

    public EmployeeDTO updateEmployee(int index, EmployeeDTO employeeDTO) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.set(index, employeeDTO); // Update employee at index
            return employeeDTO;
        }
        return null; // Return null if index is invalid
    }

    public boolean deleteEmployee(int index) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove(index); // Remove employee from list
            return true;
        }
        return false;
    }
}
