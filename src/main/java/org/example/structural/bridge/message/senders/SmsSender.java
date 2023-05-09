package org.example.structural.bridge.message.senders;

public class SmsSender extends MessageSenderBase{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS ile yollandı: " + message);
    }
}
