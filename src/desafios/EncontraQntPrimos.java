package desafios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author wellington
 * encontra primos de 1 até o valor digitado
 */
public class EncontraQntPrimos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidade de números primos: ");
		int quantidade = sc.nextInt();
		System.out.printf("Numeros Primos: %n");
		//int aux = quantidade;
		int teste = 1;
		do {
			if (TestaNumero.ehPrimo(teste)) {
				System.out.printf("%d %n", teste);
				quantidade--;	
			}
		teste++;
		} while(quantidade > 0);
	sc.close();
	}
}
