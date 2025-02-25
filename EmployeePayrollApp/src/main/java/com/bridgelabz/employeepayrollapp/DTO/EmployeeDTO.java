package com.bridgelabz.employeepayrollapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Lombok will generate getters, setters, toString, equals, and hashCode
@AllArgsConstructor // generates constructor with all fields
@NoArgsConstructor // generates no args constructor without all the fields
public class EmployeeDTO {
    private String name;
    private double salary;
}