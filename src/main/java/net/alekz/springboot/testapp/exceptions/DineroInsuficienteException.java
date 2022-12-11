package net.alekz.springboot.testapp.exceptions;

/**
 * @author alekz on 11/12/22
 */
public class DineroInsuficienteException extends RuntimeException{
    public DineroInsuficienteException(String message) {
        super(message);
    }
}
