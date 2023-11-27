package com.example.modak.logIn.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LogOutResultDto {
    private boolean success;

    private int code;

    private String msg;
}
