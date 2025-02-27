package com.bridgelabz.employeepayrollapp.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public @ToString class EmployeeDTO {


    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;

    @Min(value = 5000, message = "Min wage should be more than 500")
    public long salary;
    public String gender;
    public String startDate;
    public String note;
    public String profilePic;
    public List<String> department;
}