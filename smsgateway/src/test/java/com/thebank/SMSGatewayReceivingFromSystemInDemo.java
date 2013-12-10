package com.thebank;

public class SMSGatewayReceivingFromSystemInDemo {

    public static void main(String[] args) {
        new SMSGatewayReceivingFromSystemInDemo().showReception();
    }

    private void showReception() {
        SMSInboxSystemIn inbox = new SMSInboxSystemIn();
        MyReceiver receiver = new MyReceiver();
        inbox.setReceiver(receiver);
        inbox.startReceiving();
    }

}


