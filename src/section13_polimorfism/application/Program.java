package section13_polimorfism.application;

import section13_polimorfism.entities.Account;
import section13_polimorfism.entities.BussinessAccount;
import section13_polimorfism.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
//		BussinessAccount account = new BussinessAccount(8010, "Bob", 10.0, 500.0);
//		System.out.println(account.getBalance());
		
		// Account acc = new Account(1001, "Alex", 0.0);
		BussinessAccount bacc = new BussinessAccount(8010, "Loja", 10.0, 500.0);
	//UPCAST
		Account acc1 = bacc;
		System.out.println(acc1.getBalance());
		Account acc2 = new BussinessAccount(1003, "Loja2", 10.6, 1000.0);
		Account acc3 = new SavingsAccount(1003, "Loja2", 20.0, 0.01 );

		
		// DOWNCAST
		// BussinessAccount bacc2 = acc2; # ERRO
		BussinessAccount bacc2 = (BussinessAccount) acc2;
		bacc2.loan(200.0);
		System.out.println(bacc2.getBalance());
		
		// downcast erro
//		BussinessAccount bacc3 = acc3;
//		bacc3.loan(100.0);
//		System.out.println(bacc3.getBalance());
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount bacc4 = (BussinessAccount)acc3;
			bacc4.loan(200.5);
			System.out.println(bacc4.getBalance());
		}
		
		
	}

}
