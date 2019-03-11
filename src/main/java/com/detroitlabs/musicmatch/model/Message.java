package com.detroitlabs.musicmatch.model;

public class Message {

    private Body body;

    @Override
    public String toString() {
        return "Message{" +
                "body=" + body +
                '}';
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
