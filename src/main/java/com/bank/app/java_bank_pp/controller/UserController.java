package com.bank.app.java_bank_pp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.java_bank_pp.dto.UserRequest;
import com.bank.app.java_bank_pp.service.impl.UserServiceImpl;
import com.bank.app.java_bank_pp.dto.BankResponse;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
}
