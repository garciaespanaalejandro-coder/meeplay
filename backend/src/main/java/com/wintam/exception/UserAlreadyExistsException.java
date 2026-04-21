package com.wintam.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super("El usuario "+message+" ya está en uso.");
    }
}
