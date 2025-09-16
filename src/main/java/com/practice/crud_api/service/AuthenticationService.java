package com.practice.crud_api.service;

import com.practice.crud_api.dto.JwtAuthenticationResponse;
import com.practice.crud_api.dto.LoginRequest;
import com.practice.crud_api.dto.SignUpRequest;
import com.practice.crud_api.entity.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse logIn(LoginRequest loginRequest);
}
