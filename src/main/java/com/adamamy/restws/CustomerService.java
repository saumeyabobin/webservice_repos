package com.adamamy.restws;

import org.springframework.security.core.userdetails.User;

import com.adamamy.restws.entities.Customer;

import java.util.Optional;

public interface CustomerService {

    String login(String username, String password);
    Optional<User> findByToken(String token);
    Customer findById(Long id);
}