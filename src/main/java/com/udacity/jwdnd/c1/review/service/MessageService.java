package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private String message;
    private List<ChatMessage> chatMessages;

    // Spring AutoConfiguration will search for a bean that matches the constructor parameter
    public MessageService(String message){
        this.message = message;
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    public void storeMessage(ChatMessage message){
        this.chatMessages.add(message);
    }

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    // this is called immediately after MessageService Bean created and placed in App Context
    // good for handling initialisation logic
    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService Bean");
        this.chatMessages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm){
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
    }
}
