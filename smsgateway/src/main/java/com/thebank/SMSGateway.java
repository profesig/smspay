package com.thebank;

public interface SMSGateway {

    void startReceiving(SMSReceiver receiver);
    void send(SMS message);

}
