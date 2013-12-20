package com.thebank.gateway;

/**
 * Contract for sending SMS via SMSGateway.
 */
public interface SMSOutbox {

    /**
     * Sends an SMS.
     *
     * @param message The message to be sent.
     */
    void send(SMS message);
}
