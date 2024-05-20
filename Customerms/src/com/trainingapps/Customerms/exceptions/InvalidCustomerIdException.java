package com.trainingapps.Customerms.exceptions;

public class InvalidCustomerIdException extends RuntimeException {
    public InvalidCustomerIdException(String msg) {
        super(msg);
    }
}
