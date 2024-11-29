package com.jpa.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()) // Disable CSRF for POST requests
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/employees/**").permitAll() // Allow /employees endpoint
                        .anyRequest().authenticated()); // Protect other endpoints
        return http.build();
    }
}
