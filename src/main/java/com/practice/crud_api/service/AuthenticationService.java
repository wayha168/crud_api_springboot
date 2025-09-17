package com.practice.crud_api.service;

import com.practice.crud_api.dto.JwtAuthenticationResponse;
import com.practice.crud_api.dto.SignUpRequest;
import com.practice.crud_api.dto.SigninRequest;
import com.practice.crud_api.entity.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);}
