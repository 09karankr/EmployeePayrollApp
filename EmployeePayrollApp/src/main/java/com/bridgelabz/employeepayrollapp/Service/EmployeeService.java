package com.bridgelabz.employeepayrollapp.Service;


import lombok.extern.slf4j.Slf4j;
import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeeService {

    private final List<EmployeeDTO> employeeList = new ArrayList<>();

    public List<EmployeeDTO> getAllEmployees() {
        log.info("Fetching all employees");
        return employeeList;
    }

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        employeeList.add(employeeDTO);
        log.info("Created new employee: {}", employeeDTO);
        return employeeDTO;
    }

    public EmployeeDTO updateEmployee(int index, EmployeeDTO employeeDTO) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.set(index, employeeDTO);
            log.info("Updated employee at index {}: {}", index, employeeDTO);
            return employeeDTO;
        }
        log.warn("Invalid index {} for update", index);
        return null;
    }

    public boolean deleteEmployee(int index) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove(index);
            log.info("Deleted employee at index {}", index);
            return true;
        }
        log.error("Invalid index {} for deletion", index);
        return false;
    }
}