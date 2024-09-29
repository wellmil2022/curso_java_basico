package desafios;

import java.util.Locale;
import java.util.Scanner;
//primeira classe (teste)
public class SeEhPrimo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o número");
		int numero = sc.nextInt();
		if (ehPrimo(numero)) {
			System.out.printf("O %d É PRIMO", numero);
		} else {
			System.out.printf("O %d NÃO É PRIMO", numero);
		}

		sc.close();
	}

	public static int testaNumero(int numero) {
		int contador = 0;
		int aux = numero;
		while (aux > 0) {
			if (numero % aux == 0) {
				contador++;
			}
			aux--;
		}

		return contador;

	}

	public static boolean ehPrimo(int numero) {
		int teste = testaNumero(numero);
		if (teste != 2) {
			return false;
		} else {
			return true;
		}
	}

}
