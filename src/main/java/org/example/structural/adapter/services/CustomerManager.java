package org.example.structural.adapter.services;

import org.example.structural.adapter.VatanSMS;
import org.example.structural.adapter.sms.SmsSender;

public class CustomerManager implements CustomerService{

    private SmsSender smsSender;

    public CustomerManager(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    @Override
    public void register() {
        System.out.println("Kullanıcı kayıt edildi.");
        // SMS Gönderme
        smsSender.send("Kaydınız alındı", "+90");
    }
}
