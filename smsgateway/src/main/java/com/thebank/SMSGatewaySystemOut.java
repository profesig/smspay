package com.thebank;

public class SMSGatewaySystemOut implements SMSGateway {

    private SMSReceiver receiver = null;

    @Override
    public void startReceiving(SMSReceiver receiver) {
       this.receiver = receiver;
    }

    public void receive(String from, String to, String content) {
        SMS message = new SMS(from, to, content);
        this.receiver.receive(message);
    }

    @Override
    public void send(SMS message) {
        System.out.println("Sent: " + message.toString());
    }
}
