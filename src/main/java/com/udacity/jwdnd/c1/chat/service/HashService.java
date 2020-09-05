package com.udacity.jwdnd.c1.chat.service;

import org.springframework.stereotype.Component;

@Component
public class HashService {

    public String getHashedValue(String data, String salt) {

        return "HashedValue";
    }

}