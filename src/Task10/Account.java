//QUS 4 

package Task10;

public class Account {
	private double balance;

	// No-argument constructor, sets a default balance
	public Account() {
		this.balance = 0.0; // Default balance
	}

	// Constructor with one argument
	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	// Method to deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	// Method to withdraw money
	public boolean withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
			return true;
		} else {
			System.out.println("Insufficient balance or invalid amount");
			return false;
		}
	}

	// Getter for balance
	public double getBalance() {
		return balance;
	}

	// Main method for demonstration
	public static void main(String[] args) {
		Account account = new Account(15000.0);

		System.out.println("Initial Balance: " + account.getBalance());
		account.deposit(400.0);
		System.out.println("Balance after deposit: " + account.getBalance());
		account.withdraw(300.0);
		System.out.println("Balance after withdrawal: " + account.getBalance());
	}
}


/*
Output: 

Initial Balance: 15000.0
Deposited: 400.0
Balance after deposit: 15400.0
Withdrawn: 300.0
Balance after withdrawal: 15100.0


*/