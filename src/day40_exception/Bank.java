package day40_exception;

public class Bank {
    double balance;

    public void withdraw (double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new NotEnoughMoneyException();  //there is no exception like there is no enough balance so I make my own eception.

        }

    }
    public void login (String username, String password) throws InvalidCredentialException {        // I WANT THEM HANDLE IN USERACCOUNT CLASS NOT HERE SO I PUT throws KEYWORD AND IT IGNORES

         if (!username.equals("tomjerry")) {
            throw new InvalidCredentialException("Not valid username");
        }
        if (!password.equals("0000")) {
            throw new InvalidCredentialException("Not valid password");
        }

    }
}
