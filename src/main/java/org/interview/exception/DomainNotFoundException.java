package org.interview.exception;

public class DomainNotFoundException extends RuntimeException {

  public DomainNotFoundException(String message) {
    super(message);
  }
}
