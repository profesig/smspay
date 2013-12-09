package com.thebank;

public class SMSGatewayReceivingFromSystemInDemo {

    public static void main(String[] args) {
        new SMSGatewayReceivingFromSystemInDemo().showReception();
    }

    private void showReception() {
        SMSInboxSystemIn inbox = new SMSInboxSystemIn();
        inbox.setReceiver(new MyReceiver());
        inbox.startReceiving();
    }

}


