package com.cirilofood.cirilofood.auth.core;

import com.cirilofood.cirilofood.auth.domain.User;
import lombok.Getter;

import java.util.Collections;

@Getter
public class AuthUser extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private String fullName;

    public AuthUser(User user){
        super(user.getEmail(), user.getPassword(), Collections.emptyList());

        this.userId = user.getId();
        this.fullName = user.getName();
    }
}
