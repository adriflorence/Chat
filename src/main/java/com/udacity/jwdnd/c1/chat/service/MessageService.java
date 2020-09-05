package com.udacity.jwdnd.c1.chat.service;

import com.udacity.jwdnd.c1.chat.mapper.MessageMapper;
import com.udacity.jwdnd.c1.chat.model.ChatForm;
import com.udacity.jwdnd.c1.chat.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageService {

    private MessageMapper messageMapper;

    // Spring AutoConfiguration will search for a bean that matches the constructor parameter
    public MessageService(MessageMapper messageMapper){
        this.messageMapper = messageMapper;
    }

    // this is called immediately after MessageService Bean created and placed in App Context
    // good for handling initialisation logic
    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService Bean");
    }

    public void addMessage(ChatForm chatForm){
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        newMessage.setMessageText("Some random text");
        // TODO handles message type cases

        messageMapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages() {
        return messageMapper.getAllMessages();
    }
}
