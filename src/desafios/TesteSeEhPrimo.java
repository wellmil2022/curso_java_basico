package desafios;

import java.util.Locale;
import java.util.Scanner;

public class TesteSeEhPrimo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o número");
		int numero = sc.nextInt();
		boolean ok = TestaNumero.ehPrimo(numero);
		if (ok) {
			System.out.printf("O %d É PRIMO", numero);
		} else {
			System.out.printf("O %d NÃO É PRIMO", numero);
		}

		sc.close();

	}

}
