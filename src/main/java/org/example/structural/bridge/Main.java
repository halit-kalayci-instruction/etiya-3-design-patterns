package org.example.structural.bridge;

import org.example.structural.bridge.message.senders.EmailSender;
import org.example.structural.bridge.message.senders.SmsSender;
import org.example.structural.bridge.services.CustomerManager;
import org.example.structural.bridge.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerService = new CustomerManager();

        customerService.messageSenderBase = new EmailSender();
        customerService.verify();


        customerService.messageSenderBase = new SmsSender();
        customerService.verify();
    }
}
