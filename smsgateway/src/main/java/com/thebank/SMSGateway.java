package com.thebank;

public interface SMSGateway {

    void setReceiver(SMSReceiver receiver);
    void startReceiving();
    void send(SMS message);

}
