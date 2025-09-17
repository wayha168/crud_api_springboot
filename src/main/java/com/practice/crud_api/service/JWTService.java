package com.practice.crud_api.service;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface JWTService {

    String extractUserName(String token);

    boolean isTokenValid(String token, UserDetails userDetails);
    
    String generateToken(UserDetails userDetails);

    String generateRefreshToken(Map<String, Object> extraClaim, UserDetails userDetails);

}
