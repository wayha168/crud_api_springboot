package com.practice.crud_api.dto;

import lombok.Data;

@Data

public class JwtAuthenticationResponse {

    private String token;
    private String refreshToken;
}
