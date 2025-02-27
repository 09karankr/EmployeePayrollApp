package com.bridgelabz.employeepayrollapp.model;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity // ✅ Add this annotation to make it a JPA entity
@Table(name = "employee") // ✅ Define the table name
@AllArgsConstructor


public @Data class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Auto-generate primary key
    private int employeeId;
    private  String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private  String note;
    private  String profilePic;
    private List<String> departments;

    public Employee(){ }
    public Employee(int empId, EmployeeDTO employeeDTO){
        this.employeeId = empId;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
        this.gender = employeeDTO.gender;
        this.note = employeeDTO.note;
        this.startDate = LocalDate.parse(employeeDTO.startDate);
        this.profilePic = employeeDTO.profilePic;
        this.departments = employeeDTO.department;

    }
}