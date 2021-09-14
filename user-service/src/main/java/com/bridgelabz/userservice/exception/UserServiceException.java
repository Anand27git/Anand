package com.bridgelabz.userservice.exception;

import org.omg.CORBA.UserException;

public class UserServiceException extends RuntimeException {
    public enum ExceptionType {
        USER_ALREADY_PRESENT
    }

    public UserServiceException.ExceptionType type;

    public UserServiceException(String message, UserServiceException.ExceptionType type) {
        super(message);
        this.type = type;
    }

}
