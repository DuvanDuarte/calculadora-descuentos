package edu.unac.calculadoradescuentos;

public class InvalidPurchaseException extends RuntimeException {
    public InvalidPurchaseException(String message) {
        super(message);
    }
}