package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final HashService hashService;

    public UserService(UserMapper userMapper, HashService hashService) {
        this.userMapper = userMapper;
        this.hashService = hashService;
    }
}