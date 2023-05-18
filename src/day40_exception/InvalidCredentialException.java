package day40_exception;

public class InvalidCredentialException extends Exception {            //I want my exception to be compile exception so I extend Exception class

    public InvalidCredentialException (String msg) {
        super(msg);
    }

}
