package com.practice.crud_api.dto;

import lombok.Data;

@Data
public class SigninRequest {
    
    private String email;
    private String password;
    
}
