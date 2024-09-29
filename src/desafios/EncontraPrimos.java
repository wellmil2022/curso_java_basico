package desafios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author wellington
 * encontra primos de 1 até o valor digitado
 */
public class EncontraPrimos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vetor[];
		System.out.println("Escreva o maior valor: ");
		int numero = sc.nextInt();
		if (numero > 0) {
			vetor = new int[numero];
			System.out.printf("Numeros Primos: %n");
			//popular o vetor de inteiros
			for (int i = 0; i < numero; i++) {
				vetor[i] = i + 1;
			}
			for(int i = 0; i < vetor.length; i++) {
				if (TestaNumero.ehPrimo(vetor[i])) {
					System.out.printf("%d ", vetor[i]);
				}
			}
		} else {
			System.out.println("Escreva um número inteiro maior que 0!");
		}
		sc.close();
	}
}
