package com.sermage.chatapp;

public class Message {

    private String author;
    private String textOfMessage;
    private Long date;

    public Message(String author, String textOfMessage,Long date) {
        this.author = author;
        this.textOfMessage = textOfMessage;
        this.date=date;
    }

    public Message() {
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }
}
