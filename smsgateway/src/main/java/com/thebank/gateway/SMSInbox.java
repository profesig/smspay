package com.thebank.gateway;

/**
 * Contract for receiving SMS from SMSGateway.
 */
public interface SMSInbox {
    /**
     * Sets the receiver instance, which will receive all incoming SMS.
     *
     * @param receiver A non-null receiver instance.
     */
    void setReceiver(SMSReceiver receiver);

    /**
     * Initializes SMS reception. A receiver must be set before calling this method.
     *
     * @throws java.lang.IllegalStateException if no receiver has been set.
     */
    void startReceiving();
}
