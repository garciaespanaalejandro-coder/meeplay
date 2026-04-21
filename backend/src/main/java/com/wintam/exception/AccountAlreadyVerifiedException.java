package com.wintam.exception;

public class AccountAlreadyVerifiedException extends RuntimeException {
    public AccountAlreadyVerifiedException(String message) {
        super("Cuenta con el gmail "+message+" ya está verificada.");
    }
}
