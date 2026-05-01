package com.wintam.exception;

public class InvalidNewPassword extends RuntimeException {
    public InvalidNewPassword() {
        super("Contraseña introducida con menos caractéres de los permitidos.");
    }
}
