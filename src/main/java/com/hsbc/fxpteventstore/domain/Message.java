package com.hsbc.fxpteventstore.domain;

import java.time.LocalDateTime;

public class Message {
    String id;
    String text;
    LocalDateTime time;

    public Message(String id, String text, LocalDateTime time) {
        this.id = id;
        this.text = text;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
