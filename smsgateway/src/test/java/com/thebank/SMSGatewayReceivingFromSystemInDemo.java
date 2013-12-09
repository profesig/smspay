package com.thebank;

public class SMSGatewayReceivingFromSystemInDemo {

    public static void main(String[] args) {

        SMSGatewaySystemOut myGateway = new SMSGatewaySystemOut();
        myGateway.setReceiver(new MyReceiver());
        myGateway.startReceiving();

    }

    private static class MyReceiver implements SMSReceiver {

        @Override
        public void receive(SMS message) {
            System.out.println("Received: " + message.toString());
        }
    }
}


