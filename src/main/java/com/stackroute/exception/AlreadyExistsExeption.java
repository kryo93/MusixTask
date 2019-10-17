package com.stackroute.exception;

public class AlreadyExistsExeption extends Exception
{
    private String message;

    public AlreadyExistsExeption(){}
    public AlreadyExistsExeption(String message) {
        super(message);
        this.message = message;
    }
}
