package org.example.structural.adapter.sms;

public interface SmsSender {
    void send(String message, String to);
}
