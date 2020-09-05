package com.udacity.jwdnd.c1.chat.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {

    private List<String> messages;

    // Spring AutoConfiguration will search for a bean that matches the constructor parameter
    public MessageListService(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(String message){
        messages.add(message);
    }
}
