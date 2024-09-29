package sec6_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ConverterCelcius {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		char resposta;
		do {
			System.out.println("Escreva o valor: ");
			double celcius = entrada.nextDouble();
			double farenheit = 32+((9*celcius)/5);
			System.out.printf("Resposta = %.2f%n",farenheit);
			System.out.println("Deseja Repetir: (S / N)?");
			resposta = entrada.next().charAt(0);
		}while(resposta != 'n');
		
		entrada.close();
	}

}
