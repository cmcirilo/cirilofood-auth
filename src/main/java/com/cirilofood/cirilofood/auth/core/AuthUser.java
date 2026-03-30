package com.cirilofood.cirilofood.auth.core;

import com.cirilofood.cirilofood.auth.domain.User;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
public class AuthUser extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private String fullName;

    public AuthUser(User user, Collection<? extends GrantedAuthority> authorities) {
        super(user.getEmail(), user.getPassword(), authorities);

        this.userId = user.getId();
        this.fullName = user.getName();
    }
}
