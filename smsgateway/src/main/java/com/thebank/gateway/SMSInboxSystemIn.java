package com.thebank.gateway;

import java.util.Scanner;

/**
 * An SMSGateway Inbox to be used for experimentation, which reads incoming SMS from SystemIn and writes outgoing SMS to SystemOut.
 */
public class SMSInboxSystemIn implements SMSInbox {

    private SMSReceiver receiver = null;

    @Override
    public void setReceiver(SMSReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void startReceiving() {
        if (receiver == null)
            throw new IllegalStateException("Receiver must be set before receiving.");

        SMS message = readSmsFromSystemIn();
        this.receiver.receive(message);
    }

    private SMS readSmsFromSystemIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From number:");
        String fromNumber = scanner.nextLine();
        System.out.println("To number:");
        String toNumber = scanner.nextLine();
        System.out.println("Content:");
        String content = scanner.nextLine();
        return new SMS(fromNumber, toNumber, content);
    }


}
