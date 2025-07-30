package com.ecommerce.sb_ecom.exceptions;

import java.io.Serial;

public class APiException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public APiException() {
    }
    public APiException(String message) {
        super(message);
    }
}
