package sec8_objects.conversor.application;

import java.util.Locale;
import java.util.Scanner;

import sec8_objects.conversor.util.CurrencyConverter;

public class CalculatorMoney {

	//private static double priceDolar;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Whats is the dollar price?");
		double priceDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantDolar = sc.nextDouble();
		double paidReal = CurrencyConverter.Converter(priceDolar, quantDolar);
		System.out.printf("Amount to be paid in reais = %.2f.%n",paidReal);		
		sc.close();

	}

}
