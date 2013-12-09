package com.thebank;

import java.util.Scanner;

public class SMSGatewaySystemOut implements SMSGateway {

    private SMSReceiver receiver = null;

    @Override
    public void setReceiver(SMSReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void startReceiving() {
        if (receiver == null)
            throw new IllegalStateException("Receiver must be set before receiving.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("From number:");
        String fromNumber = scanner.nextLine();
        System.out.println("To number:");
        String toNumber = scanner.nextLine();
        System.out.println("Content:");
        String content = scanner.nextLine();
        SMS message = new SMS(fromNumber, toNumber, content);
        this.receiver.receive(message);
    }

    @Override
    public void send(SMS message) {
        System.out.println("Sent: " + message.toString());
    }
}
