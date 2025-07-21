package com.project_ecommerce.exception;

public class UserNotVerifiedException extends RuntimeException {

    private boolean newEmailSent;

    public UserNotVerifiedException(boolean newEmailSent) {
        this.newEmailSent = newEmailSent;
    }

    public boolean isNewEmailSent() {
        return newEmailSent;
    }

}
