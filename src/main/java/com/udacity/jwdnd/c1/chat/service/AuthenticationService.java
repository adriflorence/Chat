package com.udacity.jwdnd.c1.chat.service;

import com.udacity.jwdnd.c1.chat.mapper.UserMapper;
import com.udacity.jwdnd.c1.chat.model.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements AuthenticationProvider {
    private UserMapper userMapper;
    private HashService hashService;

    public AuthenticationService(UserMapper userMapper, HashService hashService) {
        this.userMapper = userMapper;
        this.hashService = hashService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        User user = userMapper.getUser(username);
        if (user != null) {
            // TODO handle case
        }

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}