package org.example.structural.adapter.adapters;

import org.example.structural.adapter.VatanSMS;
import org.example.structural.adapter.sms.SmsSender;

public class VatanSmsAdapter implements SmsSender {
    @Override
    public void send(String message, String to) {
        VatanSMS vatanSMS = new VatanSMS();
        vatanSMS.sendSms(message,to);
    }
}
