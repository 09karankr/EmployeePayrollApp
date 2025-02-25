package com.bridgelabz.employeepayrollapp.mapper;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee dtoToEntity(EmployeeDTO dto) {
        return new Employee(null, dto.getName(), dto.getSalary());
    }

    public EmployeeDTO entityToDto(Employee employee) {
        return new EmployeeDTO(employee.getName(), employee.getSalary());
    }
}
