package com.cirilofood.cirilofood.auth.core;

import com.cirilofood.cirilofood.auth.domain.User;

import java.util.Collections;

public class AuthUser extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;

    private String fullName;

    public AuthUser(User user){
        super(user.getEmail(), user.getPassword(), Collections.emptyList());

        this.fullName = user.getName();
    }
}
