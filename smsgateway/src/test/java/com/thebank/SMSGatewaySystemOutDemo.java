package com.thebank;

public class SMSGatewaySystemOutDemo {

    public static void main(String[] args) {

        SMSGatewaySystemOut myGateway = new SMSGatewaySystemOut();
        myGateway.startReceiving(new MyReceiver());
        myGateway.receive("0761234567", "0799999999", "solde");
    }

    private static class MyReceiver implements SMSReceiver {

        @Override
        public void receive(SMS message) {
            System.out.println("Received: " + message.toString());
        }
    }
}


