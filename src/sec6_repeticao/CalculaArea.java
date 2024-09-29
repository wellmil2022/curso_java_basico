package sec6_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva as dimensões: largura, comprimento e o preço do m²");
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double precoMetro = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * precoMetro;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
