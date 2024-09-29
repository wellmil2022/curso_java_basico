package sec8_objects.conta.entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
		
	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return String.format("Account %s, Holder %s, Balance: %.2f%n", number, holder, balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
		}

}
