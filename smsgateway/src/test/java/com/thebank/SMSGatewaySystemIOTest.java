package com.thebank;

import org.junit.Test;

public class SMSGatewaySystemIOTest {

    @Test(expected = IllegalStateException.class)
    public void testStartReceiving_withoutReceiver() {
        new SMSGatewaySystemIO().startReceiving();
    }



}
