package sec5_condicional;

import java.util.Scanner;

public class CalculoTelefonia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva quantos minutos:");
		int minutos = entrada.nextInt();
		double conta = 50.00;
		if (minutos >= 100) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Pagar: R$ %.2f%n", conta);

		entrada.close();

	}

}
