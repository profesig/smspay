package com.thebank.gateway;

public class SMSOutboxSystemOut implements SMSOutbox {
    @Override
    public void send(SMS message) {
        System.out.println("Sending: " + message.toString());
    }
}
