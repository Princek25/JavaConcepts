package com.workspace.exception_handling;

public class TooOldException extends RuntimeException {
    TooOldException(String msg) {
        super(msg);
    }
}
