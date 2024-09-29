package sec8_objects.produto;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
				
		Product product = new Product(name, price, quantity);
		System.out.printf("Product data: %s%n",product);
		System.out.println(product.toString());
		
		System.out.println("Enter the number of product to be added in stock:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.printf("Update data: %s%n",product);
		
		System.out.println("Enter the number of product to be removed in stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.printf("Update data: %s%n",product);
		
		
		
		sc.close();

	}

}
