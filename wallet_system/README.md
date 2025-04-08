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
