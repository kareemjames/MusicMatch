package com.detroitlabs.musicmatch.model;

import org.springframework.stereotype.Component;

@Component
public class Music {

    private Message message;

    @Override
    public String toString() {
        return "Music{" +
                "message=" + message +
                '}';
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
