package sec8_objects.conta.application;

import java.util.Locale;
import java.util.Scanner;

import sec8_objects.conta.entities.Account;

public class TestAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit? (y/N) ");
		char answer = sc.next().charAt(0);

		if (answer == 'y') {
			System.out.print("Enter initial deposity value: ");
			double initialDeposity = sc.nextDouble();
			account = new Account(number, holder, initialDeposity);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.print("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.print("update account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.print("update account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
