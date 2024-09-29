package section13_polimorfism.application;

import section13_polimorfism.entities.Account;
import section13_polimorfism.entities.SavingsAccount;

public class ProgramPoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account x = new Account(1001, "Marco", 1000.0);
		Account y = new SavingsAccount(1002, "marcelo", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("saldo X: "+ x.getBalance());
		System.out.println("saldo Y: "+ y.getBalance());
		
	}

}
