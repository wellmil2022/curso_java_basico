package sec6_repeticao;

import java.util.Scanner;

public class SomaEnquanto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		System.out.println("Escreva o número:");
		int numero = entrada.nextInt();
		while (numero != 0) {
			soma += numero;
			numero = entrada.nextInt();
		}

		System.out.println("Soma:" + soma);

		entrada.close();
		
		//Exercício
		int x =0;
		int y = 4;
		while(x <3) {
			y +=2;
			x +=1;
			System.out.println("x="+x+" e y="+y);
		}
		
	}

}
