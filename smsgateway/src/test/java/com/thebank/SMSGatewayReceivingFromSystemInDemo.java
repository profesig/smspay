package com.thebank;

public class SMSGatewayReceivingFromSystemInDemo {

    public static void main(String[] args) {

        SMSGatewaySystemIO myGateway = new SMSGatewaySystemIO();
        myGateway.setReceiver(new MyReceiver());
        myGateway.startReceiving();

    }

}


