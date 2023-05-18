package day40_exception;

public class NotEnoughMoneyException extends  RuntimeException {   //whatever runtime does inherits notenoughoney exception class

    //This is RUNTIME= UNCHECKED EXCCEPTION SINCE INHERITS THE RUNTIME EXCEPTION !!
    public NotEnoughMoneyException () {   //(str msg )
        super ("Not enough money");             //(msg )   yazabilirim
    }
}
