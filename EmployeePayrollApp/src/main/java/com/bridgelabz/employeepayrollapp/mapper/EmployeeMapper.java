package com.bridgelabz.employeepayrollapp.mapper;

import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee dtoToEntity(int empId, EmployeeDTO dto) {
        return new Employee(empId, dto);
    }

    public EmployeeDTO entityToDto(Employee employee) {
        return new EmployeeDTO(
                employee.getName(),
                employee.getSalary(),
                employee.getGender(),
                employee.getStartDate().toString(),  // Convert LocalDate to String
                employee.getNote(),
                employee.getProfilePic(),
                employee.getDepartments()
        );
    }
}
