package com.udacity.jwdnd.c1.chat.service;

import com.udacity.jwdnd.c1.chat.mapper.UserMapper;
import com.udacity.jwdnd.c1.chat.model.User;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Base64;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final HashService hashService;

    public UserService(UserMapper userMapper, HashService hashService) {
        this.userMapper = userMapper;
        this.hashService = hashService;
    }

    public boolean isUsernameAvailable(String username) {
        return userMapper.getUser(username) == null;
    }

    public int createUser(User user){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        String encodedSalt = Base64.getEncoder().encodeToString(salt);
        String pw = "password";
        return userMapper.insert(new User(null, user.getUsername(), encodedSalt, pw, user.getFirstName(), user.getLastName()));
    }

    public User getUser(String username){
        return userMapper.getUser(username);
    }
}