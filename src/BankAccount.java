package com.TASK03june;

public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;
	static String bankName;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	BankAccount() {
		this.accountNumber = "unknown";
		this.accountHolder = "unknown";
		this.balance = balance;

	}

	void deposit(double amount) {
		this.balance = balance + amount;
		System.out.println("balance deposited...");

	}

	void withdraw(double amount) {
		this.balance = balance - amount;
		System.out.println("balance withdrawed...");

	}

	static void setBankName(String name) {
		bankName = name;
		// return bankName;
	}

	void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Balance: " + balance);
		System.out.println("Bank Name: " + bankName);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(); // for default
		b1.display(); // display for default
System.out.println("**************************");
		BankAccount b2 = new BankAccount("BOI1234", "Sameer Turkar", 5000);
		setBankName("BOI");
		b2.display();
		System.out.println("**************************");
		b2.deposit(2000);
		System.out.println("**************************");
		b2.display();
		System.out.println("**************************");
		b2.withdraw(3000);
		System.out.println("**************************");
		b2.display();
		
	}
}
