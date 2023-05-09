package org.example.structural.adapter;
// bu kodların dışarıdan eklendiğini düşünelim..
public class VatanSMS {
    public void sendSms(String message, String to){
        System.out.println(message + " send to " + to);
    }
}
