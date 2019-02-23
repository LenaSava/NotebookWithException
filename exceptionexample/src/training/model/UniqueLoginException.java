package training.model;


public class UniqueLoginException extends Exception {

    UniqueLoginException() {
        super("Login already exists, try again: ");
    }
}