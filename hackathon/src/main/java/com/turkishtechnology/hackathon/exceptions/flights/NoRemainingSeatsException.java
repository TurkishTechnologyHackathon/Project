package com.turkishtechnology.hackathon.exceptions.flights;

public class NoRemainingSeatsException extends Exception {
    

    public NoRemainingSeatsException() {
        super();
    }

    public NoRemainingSeatsException(String message) {
        super(message);
    }
}
