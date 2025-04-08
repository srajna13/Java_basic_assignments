package wallet_system;
// package wallet_system;
import java.util.*;


// Custom exception:
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Transaction class:
class Transaction {
    private String type;
    private double amount;
    private Date date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date(); // current date/time
    }

    @Override
    public String toString() {
        return type + ": Rs" + amount + " on " + date;
    }
}

class Wallet{
    private String userName;
    private double balance;
    private List<Transaction> history;

    public Wallet(String userName) {
        this.userName = userName;
        this.balance = 0.0;
        this.history = new ArrayList<>();
    }

    public void addFunds(double amount) {
        balance += amount;
        history.add(new Transaction("Added", amount));
        System.out.println("Added Rs" + amount + " to User.");
    }

    public void makePayment(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for payment!");
        }
        balance -= amount;
        history.add(new Transaction("Paid", amount));
        System.out.println("Paid Rs" + amount + " from wallet.");
    }

    public void showBalance() {
        System.out.println("Current Balance: Rs" + balance);
    }

    public void showTransactionHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction t : history) {
                System.out.println(t);
            }
        }
    }
}

public class DigitalWalletSystem {

    public static void main(String[] args) throws  InsufficientBalanceException{
        Wallet user=new Wallet("Srajna");
        Scanner sc=new Scanner(System.in);

        // System.out.println("Srajna's wallet: ");

        while(true){
            System.out.println("\n=== Your Digital Wallet Menu ===");
            System.out.println("1. Add Funds");
            System.out.println("2. Make Payment");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            // Exception Handling:
            try{
                switch(choice){
                    case 1:
                        System.out.print("Enter amount to add: Rs");
                        double addAmount = sc.nextDouble();
                        user.addFunds(addAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to pay: Rs");
                        double payAmount = sc.nextDouble();
                        user.makePayment(payAmount);
                        break;
                    case 3:
                        user.showBalance();
                        break;
                    case 4:
                        user.showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using the wallet!");
                        return;
                    default:
                        System.out.println("Invalid option!");
                }

            }
            catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
    }
}