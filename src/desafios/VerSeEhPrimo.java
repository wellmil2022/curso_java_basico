package desafios;

import java.util.Locale;
import java.util.Scanner;

public class VerSeEhPrimo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o número");
		int numero = sc.nextInt();
		if (verSeEhPrimo(numero)) {
			System.out.printf("O %d É PRIMO", numero);
		} else {
			System.out.printf("O %d NÃO É PRIMO", numero);
		}

		sc.close();

	}
	
	public static boolean verSeEhPrimo(int numero) {
		int divide = 0;
		if (numero <= 1) {
			return false;
		} else {
			for (int i = 2; i > numero; i++) {
				if (numero % i == 0) {
					divide++;
				}
			}
			if (divide == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}
