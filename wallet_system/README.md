# Digital Wallet System (Java)

A simple Java-based Digital Wallet System that allows users to create accounts, add funds, make payments, and view wallet balance and transaction history.

## Features

- Create a digital wallet for users.
- Deposit and withdraw funds.
- View current balance.
- Maintain transaction history.
- Basic validations with exception handling.

---

## Concepts Covered

### Java Basics
- Variables, data types, operators
- Control statements (`if`, `switch`, `loops`)
- Arrays and Strings

### Object-Oriented Programming (OOP)
- Classes & Objects
- Encapsulation (private fields + getters/setters)
- Inheritance (User → PremiumUser, etc.)
- Polymorphism (Overridden `toString()`)
- Abstraction (separate business logic classes)

### Collections Framework
- `ArrayList` → For storing transactions  
- `HashMap` → For mapping user accounts  
- `HashSet` → To avoid duplicate users  
- `ArrayDeque` → For recent transaction lookup (optional)  
- `PriorityQueue` → Could be used for priority user queue (bonus)

### Exception Handling
- `try-catch-finally` blocks
- Custom exceptions (e.g., `InsufficientFundsException`)

---
##  Class Structure

###  `Transaction` Class  
Represents a single transaction such as a deposit or a payment.

| Field / Method | Description |
|----------------|-------------|
| `type`         | The type of transaction (`"Deposit"` or `"Payment"`). |
| `amount`       | The amount involved in the transaction. |
| `date`         | The date and time when the transaction occurred. |
| `Transaction(String type, double amount)` | Constructor that initializes the transaction with type, amount, and current timestamp. |
| `toString()`   | Returns a human-readable string of the transaction, like `"Deposit: $100.0 on 2025-04-08"`. |

---

###  `Wallet` Class  
Manages the user's wallet operations and transaction history.

| Field / Method | Description |
|----------------|-------------|
| `balance`                | Stores the current balance in the wallet. |
| `transactions`           | A list that stores all transaction records. |
| `addFunds(double amount)`| Adds a specified amount to the wallet and logs a `"Deposit"` transaction. |
| `makePayment(double amount)` | Deducts a specified amount from the wallet if funds are sufficient and logs a `"Payment"` transaction. |
| `getBalance()`           | Returns the current wallet balance. |
| `printTransactionHistory()` | Displays the list of all transactions in chronological order. |
