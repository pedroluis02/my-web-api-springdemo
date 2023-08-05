package com.github.pedroluis02.webapidemo.api.model;

public class HelloGreeting {
    private final String content;

    public HelloGreeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
