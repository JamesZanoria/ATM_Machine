ATM Withdrawal Simulator
 
Description

This is a simple ATM Withdrawal Simulator built in Java.
The program asks the user to enter:
      - Their current balance
      - The amount they want to withdraw
It then checks if the withdrawal amount is valid and handles any possible errors gracefully using try-catch blocks.

----------------------------------------------------------------------------------------------------------

Features

- Converts user inputs to numbers
- Validates withdrawal amount

Handles:
- Invalid number format (letters instead of digits)
- Withdrawal greater than available balance
- Negative or zero withdrawal amounts

----------------------------------------------------------------------------------------------------------

How It Works

The program follows these main steps:
    Step 1: Setup
        - A class named ATMWithdrawal is created.
        - Uses Scanner to read user input.
    Step 2: Implement Logic
        - Uses try-catch to handle:
        - Invalid numeric inputs
        - Insufficient balance
        - Negative withdrawal amount
    Step 3: Output
        - Displays clear and user-friendly messages based on the input validation.

----------------------------------------------------------------------------------------------------------

Sample Output
Enter your current balance: 1000
Enter withdrawal amount: 1500
Error: Insufficient funds.

Enter your current balance: abc
Error: Invalid number format.

Enter withdrawal amount: -200
Error: Withdrawal amount must be positive.

----------------------------------------------------------------------------------------------------------

Concepts Practiced
- Exception handling using try-catch
- Input validation
- Conditional logic
- Basic console I/O with Scanner
