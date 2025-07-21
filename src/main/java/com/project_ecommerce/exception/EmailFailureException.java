package com.project_ecommerce.exception;

public class EmailFailureException extends RuntimeException {
  public EmailFailureException(String message) {
    super(message);
  }
}
