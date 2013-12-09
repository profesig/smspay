package com.thebank;

import java.util.Date;

public class SMS {

    private final String fromNumber;
    private final String destinationNumber;
    private final String content;
    private final Date createdOn;

    public SMS(String fromNumber, String destinationNumber, String content) {
        this.fromNumber = fromNumber;
        this.destinationNumber = destinationNumber;
        this.content = content;
        createdOn = new Date();
    }

    @Override
    public String toString() {
        return "SMS{" +
                "fromNumber='" + fromNumber + '\'' +
                ", destinationNumber='" + destinationNumber + '\'' +
                ", content='" + content + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
