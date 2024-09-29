package sec9_class.problema;

import java.util.Locale;
import java.util.Scanner;

public class CalcAvaregePriceProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the number of products: ");
		// n = quantity
		int n = sc.nextInt();
		Product[] list = new Product[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Write the name of %dº product: ", i);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Write the price of %dº product: ", i);
			double price = sc.nextDouble();
			Product product = new Product(name, price);
			list[i] = product;
		}
		sc.close();
		// show products
		for(int i = 0; i < n; i++) {
			System.out.println(list[i].toString());
		}
		
		//calc average
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += list[i].getPrice();
		}
		double avg = sum / list.length;
		System.out.printf("The average of prices is %5.2f", avg);
	}

}
