package sec5_condicional;

import java.util.Scanner;

public class Cumprimento {

	public Cumprimento() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Que horas são?");
		int hora = entrada.nextInt();

		if (hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora <= 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		entrada.close();

	}

}
