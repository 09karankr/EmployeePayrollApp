package com.bridgelabz.employeepayrollapp.Service;


import com.bridgelabz.employeepayrollapp.exception.EmployeeNotFoundException;
import com.bridgelabz.employeepayrollapp.model.Employee;
import lombok.extern.slf4j.Slf4j;
import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {
     private List<Employee> employeeList = new ArrayList<>();

     public Employee getEmployeeById(int id){
         return  employeeList.stream()
                 .filter(emp -> emp.getId() == id)
                 .findFirst()
                 .orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " not found"));
     }

}