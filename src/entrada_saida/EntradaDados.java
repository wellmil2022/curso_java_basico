package entrada_saida;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Digite um texto");
		x = sc.next();
		System.out.println("Você digitou: "+ x);
				
		int y;
		System.out.println("Digite um número");
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);
		
		double z;
		System.out.println("Digite um número decimal");
		z = sc.nextDouble();
		System.out.println("Você digitou: "+ z);
		
		char c;
		System.out.println("Digite uma letra");
		c = sc.next().charAt(0);
		System.out.println("Você digitou: "+ c);
		
		
		sc.close();
	}

}
