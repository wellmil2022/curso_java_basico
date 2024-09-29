package sec6_repeticao;

import java.util.Scanner;

public class SomaFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma =0;
		System.out.println("Escreva o número: ");
		int numero = entrada.nextInt();
		for(int i = 1;i <= numero; i++) {
			System.out.println("Escreva o próx número: ");
			int numero2 = entrada.nextInt();
			soma +=numero2; 
		}
		System.out.println("Soma = "+soma);
		entrada.close();
	}

}
