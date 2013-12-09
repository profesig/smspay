package com.thebank;

class MyReceiver implements SMSReceiver {

    @Override
    public void receive(SMS message) {
        System.out.println("Received: " + message.toString());
    }
}
