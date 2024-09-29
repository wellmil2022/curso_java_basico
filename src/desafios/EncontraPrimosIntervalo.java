package desafios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author wellington
 * encontra primos em um intervalo digitado
 */
public class EncontraPrimosIntervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vetor[];
		System.out.println("Escreva o menor valor: ");
		int numeroMin = sc.nextInt();
		System.out.println("Escreva o maior valor: ");
		int numeroMax = sc.nextInt();
		vetor = new int[numeroMax - numeroMin + 1];
		
		System.out.printf("%n%nNumeros Primos: %n");
		// popular o vetor de inteiros
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = numeroMin;
			numeroMin++;
			if (TestaNumero.ehPrimo(vetor[i])) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		sc.close();
	}
}
