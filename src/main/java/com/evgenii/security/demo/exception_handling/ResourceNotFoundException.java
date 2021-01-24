package com.evgenii.security.demo.exception_handling;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
            super(message);
    }
}
