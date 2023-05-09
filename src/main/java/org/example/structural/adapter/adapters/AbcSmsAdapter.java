package org.example.structural.adapter.adapters;

import org.example.structural.adapter.AbcSMS;
import org.example.structural.adapter.sms.SmsSender;

public class AbcSmsAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        AbcSMS abcSMS = new AbcSMS();
        abcSMS.send(to, message);
    }
}
