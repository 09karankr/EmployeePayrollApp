package com.bridgelabz.employeepayrollapp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private  String message;
    private Object data;
}
