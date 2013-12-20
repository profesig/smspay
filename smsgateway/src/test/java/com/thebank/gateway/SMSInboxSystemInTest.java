package com.thebank.gateway;

import org.junit.Test;

public class SMSInboxSystemInTest {

    @Test(expected = IllegalStateException.class)
    public void testStartReceiving_withoutReceiver() {
        new SMSInboxSystemIn().startReceiving();
    }


}
