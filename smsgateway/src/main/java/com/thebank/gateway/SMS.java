package com.thebank.gateway;

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

    public String getFromNumber() {
        return fromNumber;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedOn() {
        return createdOn;
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
