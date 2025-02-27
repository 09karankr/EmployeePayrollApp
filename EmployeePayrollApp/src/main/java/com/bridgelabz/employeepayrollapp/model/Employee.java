package com.bridgelabz.employeepayrollapp.model;



import com.bridgelabz.employeepayrollapp.DTO.EmployeeDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
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
    @JsonFormat(pattern = "dd MMM yyyy") // ✅ Ensures JSON serialization/deserialization
    @NotNull(message = "StartDate should not be empty")
    @PastOrPresent(message = "StartDate should be in the past or today")
    private LocalDate startDate; // ✅ Correct Type
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
        this.startDate = employeeDTO.startDate;
        this.profilePic = employeeDTO.profilePic;
        this.departments = employeeDTO.department;

    }
}