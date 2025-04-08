// Custom Exception
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class  ExceptionHandlingAccount {
    private int balance = 1000;

    public void withdraw(int amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: Rs" + balance);
    }

    public static void main(String[] args) {
        ExceptionHandlingAccount account = new ExceptionHandlingAccount();

        try {
            account.withdraw(500); // Trying to withdraw more than available
        } catch (LowBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.");
        }
    }
}
