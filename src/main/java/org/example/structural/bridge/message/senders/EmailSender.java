package org.example.structural.bridge.message.senders;

public class EmailSender extends MessageSenderBase{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email ile yollandı: " + message);
    }
}
