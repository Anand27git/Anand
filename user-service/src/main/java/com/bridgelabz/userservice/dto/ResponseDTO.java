package com.bridgelabz.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ResponseDTO {
    private String message;
    private Object data;
}
