package com.udacity.jwdnd.c1.chat.model;

public class ChatForm {

    private String username;
    private String messageText;
    private String messageType;


    public String getMessageText() {
        return messageText;
    }

    public String getUsername() {
        return username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
