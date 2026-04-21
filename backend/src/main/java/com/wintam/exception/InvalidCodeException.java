package com.wintam.exception;

public class InvalidCodeException extends RuntimeException {
    public InvalidCodeException() {
        super("El código introducido es incorrecto");
    }
}
